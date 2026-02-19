/**
 * Основной модуль приложения СКУД RusGuard
 * @module app
 */

/**
 * Главное приложение
 */
const App = {
    /**
     * Состояние приложения
     */
    state: {
        selectedGroupId: null,
        selectedEmployeeId: null,
        selectedEmployeeData: null, // Данные выбранного сотрудника
        employeesData: null, // Данные сотрудников текущей группы
        searchMode: null,
        positionsCache: null,
        allGroupsData: null
    },

    /**
     * Инициализация приложения
     */
    init() {
        this.setupEventListeners();
        this.initUI();
        this.loadInitialData();
    },

    /**
     * Инициализация UI компонентов
     */
    initUI() {
        // Установка текущей даты
        const today = new Date().toISOString().split('T')[0];
        $('#passageDate').val(today);

        // Инициализация дат для удалённой работы
        this.initRemoteWorkDates();

        // Инициализация DataTable
        setTimeout(() => UIManager.initEmployeesTable(), 100);

        // Подстройка layout
        this.adjustLayout();
        $(window).on('resize', () => {
            this.adjustLayout();
            if (UIManager.employeesDataTable) {
                setTimeout(() => {
                    UIManager.employeesDataTable.columns.adjust();
                }, 100);
            }
        });
    },

    /**
     * Загрузка начальных данных
     */
    async loadInitialData() {
        Utils.showLoading('#employeeGroupsTree');

        try {
            const data = await RusGuardAPI.getEmployeeGroups();
            this.state.allGroupsData = data;

            // Заполняем выпадающий список
            this.renderTopLevelGroups(data);

            // Устанавливаем группу по умолчанию
            const defaultGroupId = "75c0f525-0851-4730-9edc-f16e955a32ca";
            const defaultGroup = this.findGroupById(data, defaultGroupId);

            if (defaultGroup) {
                $('#groupSelector').val(defaultGroupId);
                this.filterAndDisplayGroupTree(defaultGroupId);
                this.state.selectedGroupId = defaultGroupId;
                await this.loadEmployeesByGroup(defaultGroupId);
            } else {
                this.renderEmployeeGroupsTree(data);
            }
        } catch (error) {
            console.error('Ошибка загрузки групп:', error);
            Utils.showError('#employeeGroupsTree', 'Не удалось загрузить группы');
        }
    },

    /**
     * Настройка обработчиков событий
     */
    setupEventListeners() {
        // Изменение даты для проходов
        $('#passageDate').on('change', () => {
            if (this.state.selectedEmployeeId) {
                this.loadPassages();
            }
        });

        // Выбор должности из списка
        $(document).on('change', '#editPositionSelect', function () {
            const selectedValue = $(this).val();
            if (selectedValue) {
                $('#editPosition').val(selectedValue);
            }
        });

        // Чекбокс использования родительских доступов
        $(document).on('change', '#useParentAccess', () => {
            UIManager.updateLevelCheckboxesState();
        });

        // Enter в полях поиска
        $('#searchFIO, #searchTabel').on('keypress', (e) => {
            if (e.which === 13) {
                e.preventDefault();
                this.performSearch();
            }
        });
        // Клик по кнопке поиска удаленной работы
        $('#searchRemoteWork').on('click', () => {
            this.searchRemoteWork();
        });
        // Вкладки
        $('#topMenu a').on('shown.bs.tab', (e) => {
            if (e.target.getAttribute('href') === '#reports') {
                this.loadReports();
            }
        });

        // Переключение вкладок в модальном окне редактирования
        $(document).on('shown.bs.tab', '#editEmployeeTabs button[data-bs-toggle="tab"]', (e) => {
            const target = $(e.target).data('bs-target');
            if (target === '#access-levels') {
                const employeeId = $('#editEmployeeId').val();
                if (employeeId) {
                    this.loadEmployeeAccessLevels();
                }
            }
        });
    },

    /**
     * Подстройка layout под размер окна
     */
    adjustLayout() {
        const windowHeight = $(window).height();
        const topSectionHeight = $('#top-section').outerHeight();
        const mainContentHeight = windowHeight - topSectionHeight - 30;

        $('.main-content').css('height', mainContentHeight + 'px');
    },

    // ============================================
    // РАБОТА С ГРУППАМИ
    // ============================================

    /**
     * Поиск группы по ID
     * @param {Object} groups - Данные о группах
     * @param {string} id - ID группы
     * @returns {Object|null} Найденная группа или null
     */
    findGroupById(groups, id) {
        if (!groups || !id) return null;

        if (Array.isArray(groups)) {
            for (const group of groups) {
                if (group.id === id || group.ID === id) return group;
                if (group.children) {
                    const found = this.findGroupById(group.children, id);
                    if (found) return found;
                }
            }
        } else if (groups.groups && Array.isArray(groups.groups)) {
            return this.findGroupById(groups.groups, id);
        }

        return null;
    },

    /**
     * Отображение корневых групп в выпадающем списке
     * @param {Object} data - Данные о группах
     */
    renderTopLevelGroups(data) {
        const select = $('#groupSelector');
        select.empty();

        const groups = data.groups || data || [];

        if (!Array.isArray(groups) || groups.length === 0) {
            select.append('<option value="">Нет доступных групп</option>');
            return;
        }

        select.append('<option value="">Выберите группу</option>');

        const sortedGroups = [...groups].sort((a, b) => {
            const nameA = (a.name || a.Name || '').toLowerCase();
            const nameB = (b.name || b.Name || '').toLowerCase();
            return nameA.localeCompare(nameB);
        });

        sortedGroups.forEach(group => {
            if (group.id) {
                const text = group.name || group.Name || group.id;
                select.append(`<option value="${group.id}">${Utils.escapeHtml(text)}</option>`);
            }
        });
    },

    /**
     * Обработчик выбора группы из выпадающего списка
     */
    onGroupSelected() {
        const groupId = $('#groupSelector').val();
        if (!groupId) return;

        // Очищаем выбранного сотрудника
        this.state.selectedEmployeeId = null;
        this.state.selectedEmployeeData = null;
        this.state.employeesData = null;
        $('#accessLevelsList').empty();
        $('#passagesContainer').empty();
        $('#remoteWorkContainer').empty();
        $('#remoteWorkEmployeeInfo').text('Выберите сотрудника для просмотра удалённой работы');

        if (UIManager.employeesDataTable) {
            UIManager.employeesDataTable.clear().draw();
        }

        this.filterAndDisplayGroupTree(groupId);
        this.state.selectedGroupId = groupId;
        this.loadEmployeesByGroup(groupId);
    },

    /**
     * Фильтрация и отображение дерева группы
     * @param {string} groupId - ID группы
     */
    filterAndDisplayGroupTree(groupId) {
        if (!this.state.allGroupsData) return;

        const selectedGroup = this.findGroupById(this.state.allGroupsData, groupId);

        if (selectedGroup) {
            this.renderEmployeeGroupsTree([selectedGroup]);

            setTimeout(() => {
                const $tree = $('#employeeGroupsTree');
                const tree = $tree.jstree(true);
                if (tree) {
                    tree.select_node(groupId);
                }
            }, 300);
        } else {
            this.renderEmployeeGroupsTree(this.state.allGroupsData);
        }
    },

    /**
     * Отображение дерева групп
     * @param {Object} data - Данные о группах
     */
    renderEmployeeGroupsTree(data) {
        const $tree = $('#employeeGroupsTree');

        const existingTree = $.jstree.reference($tree);
        if (existingTree) {
            existingTree.destroy(true);
        }

        $tree.empty();

        const treeData = this.transformGroupsToTree(data);

        $tree.jstree({
            core: {
                data: treeData,
                themes: {
                    responsive: true,
                    dots: true,
                    icons: true
                },
                check_callback: true,
                multiple: false,
                animation: 0,
                expand_selected_onload: false
            },
            plugins: ['wholerow', 'types'],
            types: {
                default: {
                    icon: 'bi bi-folder'
                }
            }
        }).on('select_node.jstree', (e, data) => {
            if (data && data.node) {
                this.state.selectedGroupId = data.node.id;
                const groupName = data.node.text;

                if ($('#addEmployeeModal').is(':visible')) {
                    $('#addEmployeeGroupId').val(this.state.selectedGroupId);
                    $('#groupNameDisplay').text(`Сотрудник будет добавлен в группу: ${groupName}`);
                }

                this.loadEmployeesByGroup(this.state.selectedGroupId);
            }
        });
    },

    /**
     * Преобразование данных групп для jsTree
     * @param {Object} data - Данные о группах
     * @returns {Array} Данные для jsTree
     */
    transformGroupsToTree(data) {
        if (!data) return [];

        if (data.groups && Array.isArray(data.groups)) {
            return this.transformGroupsArray(data.groups);
        }

        if (Array.isArray(data)) {
            return this.transformGroupsArray(data);
        }

        return [];
    },

    /**
     * Преобразование массива групп для jsTree
     * @param {Array} groups - Массив групп
     * @returns {Array} Данные для jsTree
     */
    transformGroupsArray(groups) {
        if (!groups || !Array.isArray(groups)) return [];

        return groups.map(group => {
            return {
                id: group.id || group.ID || '',
                text: group.text || group.name || group.Name || 'Без названия',
                icon: group.icon || "bi bi-folder",
                children: group.children && Array.isArray(group.children) && group.children.length > 0
                    ? this.transformGroupsArray(group.children)
                    : false
            };
        });
    },

    // ============================================
    // РАБОТА С СОТРУДНИКАМИ
    // ============================================

    /**
     * Загрузка сотрудников группы
     * @param {string} groupId - ID группы
     */
    async loadEmployeesByGroup(groupId) {
        if (!groupId) return;

        Utils.showLoading('#employeesList');

        try {
            const data = await RusGuardAPI.getEmployeesByGroup(groupId);

            // Сохраняем данные сотрудников для последующего использования
            if (data && Array.isArray(data)) {
                this.state.employeesData = data;
            } else if (data && data.data && Array.isArray(data.data)) {
                this.state.employeesData = data.data;
            } else if (data && data.employees && Array.isArray(data.employees)) {
                this.state.employeesData = data.employees;
            } else if (data && data.result && Array.isArray(data.result)) {
                this.state.employeesData = data.result;
            }

            UIManager.renderEmployeesList(data);
        } catch (error) {
            console.error('Ошибка загрузки сотрудников:', error);
            Utils.showError('#employeesList', 'Не удалось загрузить сотрудников');
        }
    },

    /**
     * Выбор сотрудника
     * @param {string} employeeId - ID сотрудника
     */
    selectEmployee(employeeId) {
        this.state.selectedEmployeeId = employeeId;

        // Находим данные выбранного сотрудника
        if (this.state.employeesData) {
            const employee = this.state.employeesData.find(emp =>
                (emp.ID || emp.id || emp.Id) === employeeId
            );
            this.state.selectedEmployeeData = employee || null;

            // Отладочный вывод данных выбранного сотрудника
            console.log('Выбранный сотрудник:', employee);

            // Обновляем информацию в секции удалённой работы
            this.updateRemoteWorkEmployeeInfo();
        }

        $('#employeesTable tbody tr').removeClass('table-primary');
        $(`tr[data-employee-id="${employeeId}"]`).addClass('table-primary');

        this.loadAccessLevels(employeeId);
        this.loadPassages();
    },

    /**
     * Обновление информации о выбранном сотруднике в секции удалённой работы
     */
    updateRemoteWorkEmployeeInfo() {
        const infoSpan = $('#remoteWorkEmployeeInfo');

        if (!this.state.selectedEmployeeData) {
            infoSpan.html('Выберите сотрудника для просмотра удалённой работы');
            return;
        }

        const emp = this.state.selectedEmployeeData;
        const lastName = emp.LastName || emp.lastName || '';
        const firstName = emp.FirstName || emp.firstName || '';
        const secondName = emp.SecondName || emp.secondName || '';

        // Пытаемся получить табельный номер из разных полей
        const tabelNumber = emp.Number || emp.TabelNumber || emp.tabelNumber || emp.number || '';

        // Отладочный вывод полей табельного номера
        console.log('Поля табельного номера:', {
            'Number': emp.Number,
            'TabelNumber': emp.TabelNumber,
            'tabelNumber': emp.tabelNumber,
            'number': emp.number,
            'Итог': tabelNumber
        });

        const fio = [lastName, firstName, secondName].filter(Boolean).join(' ');

        infoSpan.html(`<strong>${Utils.escapeHtml(fio)}</strong> (таб. № ${Utils.escapeHtml(tabelNumber)})`);
    },

    /**
     * Загрузка уровней доступа сотрудника
     * @param {string} employeeId - ID сотрудника
     */
    async loadAccessLevels(employeeId) {
        Utils.showLoading('#accessLevelsList');

        try {
            const data = await RusGuardAPI.getAccessLevelsEmployee(employeeId);
            UIManager.renderAccessLevels(data);
        } catch (error) {
            console.error('Ошибка загрузки уровней доступа:', error);
            Utils.showError('#accessLevelsList', 'Не удалось загрузить уровни доступа');
        }
    },

    /**
     * Загрузка проходов
     */
    async loadPassages() {
        if (!this.state.selectedEmployeeId) {
            $('#passagesContainer').html('<div class="text-center py-3">Выберите сотрудника для просмотра проходов</div>');
            return;
        }

        const date = $('#passageDate').val();
        const formattedDate = Utils.formatDateForAPI(date);

        Utils.showLoading('#passagesContainer');

        try {
            const data = await RusGuardAPI.getPassagesByDate(this.state.selectedEmployeeId, formattedDate);
            UIManager.renderPassages(data);
        } catch (error) {
            console.error('Ошибка загрузки проходов:', error);
            Utils.showError('#passagesContainer', 'Не удалось загрузить данные о проходах');
        }
    },

    // ============================================
    // РЕДАКТИРОВАНИЕ СОТРУДНИКА
    // ============================================

    /**
     * Редактирование сотрудника
     * @param {string} employeeId - ID сотрудника
     * @param {Event} event - Событие клика
     */
    editEmployee(employeeId, event) {
        event.stopPropagation();

        window.currentEditEmployeeId = employeeId;
        UIManager.restoreEditForm();
        $('#employeeAccessLevelsBody').empty();
        $('#accessLevelsCount').text('0');

        $('#editEmployeeModal').modal('show');
        this.loadPositionsForSelect();
        this.loadEmployeeDataForEdit(employeeId);
    },

    /**
     * Загрузка данных сотрудника для редактирования
     * @param {string} employeeId - ID сотрудника
     */
    async loadEmployeeDataForEdit(employeeId) {
        Utils.showLoading('#editEmployeeForm');

        try {
            const data = await RusGuardAPI.getEmployeeById(employeeId);
            UIManager.restoreEditForm();
            this.populateEditForm(data);
            this.loadEmployeeAccessLevels();
        } catch (error) {
            console.error('Ошибка загрузки данных сотрудника:', error);
            UIManager.restoreEditForm();
            Utils.showToast('Не удалось загрузить данные сотрудника: ' + error.message, 'danger');
        }
    },

    /**
     * Заполнение формы редактирования
     * @param {Object} data - Данные сотрудника
     */
    populateEditForm(data) {
        if (!data) {
            Utils.showToast('Данные сотрудника не получены', 'warning');
            return;
        }

        let employeeData = null;

        if (data.data && Array.isArray(data.data) && data.data.length > 0) {
            employeeData = data.data[0];
        } else if (Array.isArray(data) && data.length > 0) {
            employeeData = data[0];
        } else if (typeof data === 'object') {
            employeeData = data;
        } else {
            Utils.showToast('Неправильная структура данных сотрудника', 'warning');
            return;
        }

        $('#editEmployeeId').val(window.currentEditEmployeeId || employeeData.ID || employeeData.Id || employeeData.id);
        $('#editLastName').val(employeeData.LastName || employeeData.lastName || '');
        $('#editFirstName').val(employeeData.FirstName || employeeData.firstName || '');
        $('#editSecondName').val(employeeData.SecondName || employeeData.secondName || '');
        $('#editTabelNumber').val(employeeData.Number || employeeData.TabelNumber || employeeData.tabelNumber || '');

        const positionID = employeeData.PositionID || employeeData.positionId || '';
        const positionName = employeeData.Position || employeeData.position || '';

        $('#editPosition').val(positionID);

        setTimeout(() => {
            const $select = $('#editPositionSelect');

            if (positionID) {
                const optionExists = $select.find('option[value="' + positionID + '"]').length > 0;

                if (optionExists) {
                    $select.val(positionID);
                } else if (this.state.positionsCache) {
                    const positionInCache = this.state.positionsCache.find(p => p.ID === positionID);
                    if (positionInCache) {
                        $select.append(`<option value="${positionID}">${positionInCache.Name} (текущая)</option>`);
                        $select.val(positionID);
                    } else if (positionName) {
                        $select.append(`<option value="${positionID}">${positionName} (текущая)</option>`);
                        $select.val(positionID);
                    }
                }
            }
        }, 500);

        $('#editPassportIISUE').val(employeeData.PassportIssue || employeeData.PassportIISUE || '');
        $('#editPassportNumber').val(employeeData.PassportNumber || '');
    },

    /**
     * Загрузка уровней доступа сотрудника в модальное окно
     */
    async loadEmployeeAccessLevels() {
        const employeeId = $('#editEmployeeId').val();

        if (!employeeId) {
            Utils.showToast('ID сотрудника не найден', 'warning');
            return;
        }

        $('#employeeAccessLevelsBody').html(`
            <tr>
                <td colspan="5" class="text-center py-3">
                    <div class="spinner-border spinner-border-sm" role="status">
                        <span class="visually-hidden">Загрузка...</span>
                    </div>
                    Загрузка уровней доступа...
                </td>
            </tr>
        `);

        try {
            const data = await RusGuardAPI.getAccessLevelsEmployee(employeeId);
            UIManager.renderEmployeeAccessLevelsTable(data);
        } catch (error) {
            console.error('Ошибка загрузки уровней доступа:', error);
            $('#employeeAccessLevelsBody').html(`
                <tr>
                    <td colspan="5" class="text-center py-3 text-danger">
                        <i class="bi bi-exclamation-triangle me-2"></i>
                        Не удалось загрузить уровни доступа
                    </td>
                </tr>
            `);
        }
    },

    /**
     * Загрузка списка должностей
     */
    async loadPositionsForSelect() {
        try {
            const data = await RusGuardAPI.getPositions();

            const select = $('#editPositionSelect');
            select.empty();
            select.append('<option value="">Выберите должность</option>');

            if (typeof data !== 'object' || data === null) {
                select.append('<option value="">Ошибка загрузки должностей</option>');
                return;
            }

            const positionsArray = Object.entries(data).map(([id, name]) => ({
                ID: id,
                Name: name
            }));

            if (positionsArray.length === 0) {
                select.append('<option value="">Нет доступных должностей</option>');
                return;
            }

            positionsArray.sort((a, b) => a.Name.localeCompare(b.Name));

            positionsArray.forEach(position => {
                const id = position.ID || '';
                const name = position.Name || 'Без названия';
                if (id && name) {
                    select.append(`<option value="${Utils.escapeHtml(id)}">${Utils.escapeHtml(name)}</option>`);
                }
            });

            this.state.positionsCache = positionsArray;
        } catch (error) {
            console.error('Ошибка загрузки должностей:', error);
            $('#editPositionSelect').html(`
                <option value="">Ошибка загрузки должностей</option>
                <option value="">Проверьте подключение к API</option>
            `);
        }
    },

    /**
     * Сохранение изменений сотрудника
     */
    async saveEditedEmployee() {
        const employeeId = $('#editEmployeeId').val();

        if (!employeeId) {
            Utils.showToast('ID сотрудника не найден', 'danger');
            return;
        }

        const positionSelect = $('#editPositionSelect').val();
        const positionManual = $('#editPosition').val().trim();
        const position = positionManual || positionSelect || '';

        const employeeData = {
            id: employeeId,
            firstName: $('#editFirstName').val().trim(),
            lastName: $('#editLastName').val().trim(),
            secondName: $('#editSecondName').val().trim(),
            tabelNumber: parseInt($('#editTabelNumber').val()) || 0,
            position: position,
            PassportIISUE: $('#editPassportIISUE').val().trim(),
            PassportNumber: $('#editPassportNumber').val().trim(),
        };

        if (!employeeData.firstName || !employeeData.lastName) {
            Utils.showToast('Фамилия и имя обязательны для заполнения', 'warning');
            return;
        }

        if (!employeeData.tabelNumber || employeeData.tabelNumber <= 0) {
            Utils.showToast('Табельный номер обязателен и должен быть положительным числом', 'warning');
            return;
        }

        const saveButton = $('#editEmployeeModal .btn-warning');
        const originalText = saveButton.html();
        saveButton.html('<span class="spinner-border spinner-border-sm"></span> Сохранение...');
        saveButton.prop('disabled', true);

        try {
            await RusGuardAPI.saveEmployee(employeeId, employeeData);
            Utils.showToast('Данные сотрудника успешно обновлены', 'success');
            $('#editEmployeeModal').modal('hide');

            if (this.state.selectedGroupId) {
                await this.loadEmployeesByGroup(this.state.selectedGroupId);
            }
        } catch (error) {
            console.error('Ошибка сохранения сотрудника:', error);
            Utils.showToast(`Ошибка сохранения: ${error.message}`, 'danger');
        } finally {
            saveButton.html(originalText);
            saveButton.prop('disabled', false);
        }
    },

    /**
     * Переключение статуса блокировки сотрудника
     * @param {string} employeeId - ID сотрудника
     * @param {boolean} lockState - Статус блокировки
     * @param {Event} event - Событие клика
     */
    async toggleEmployeeLock(employeeId, lockState, event) {
        event.stopPropagation();

        if (!confirm(`Вы уверены, что хотите ${lockState ? 'заблокировать' : 'разблокировать'} сотрудника?`)) {
            return;
        }

        try {
            await RusGuardAPI.setEmployeeLock(employeeId, lockState);
            Utils.showToast(`Сотрудник успешно ${lockState ? 'заблокирован' : 'разблокирован'}`, 'success');
            this.refreshCenterSection();
        } catch (error) {
            console.error('Ошибка:', error);
            Utils.showToast('Ошибка изменения статуса сотрудника', 'danger');
        }
    },

    // ============================================
    // ДОБАВЛЕНИЕ СОТРУДНИКА
    // ============================================

    /**
     * Показ модального окна добавления сотрудника
     */
    showAddEmployeeModal() {
        if (!this.state.selectedGroupId) {
            Utils.showToast('Пожалуйста, выберите группу для добавления сотрудника', 'warning');
            return;
        }

        const $tree = $('#employeeGroupsTree');
        const tree = $tree.jstree(true);
        const node = tree.get_node(this.state.selectedGroupId);
        const groupName = node ? node.text : 'Неизвестная группа';

        $('#addEmployeeGroupId').val(this.state.selectedGroupId);
        $('#groupNameDisplay').text(`Сотрудник будет добавлен в группу: ${groupName}`);

        $('#addEmployeeForm')[0].reset();
        $('#addEmployeeModal').modal('show');
    },

    /**
     * Добавление нового сотрудника
     */
    async addEmployee() {
        if (!this.state.selectedGroupId) {
            Utils.showToast('Пожалуйста, выберите группу для добавления сотрудника', 'warning');
            return;
        }

        const form = $('#addEmployeeForm')[0];

        const lastName = form.lastname.value.trim();
        const firstName = form.firstname.value.trim();
        const tabelNumber = form.tabelNumber.value.trim();

        if (!lastName || !firstName || !tabelNumber) {
            Utils.showToast('Фамилия, имя и табельный номер обязательны для заполнения', 'warning');
            return;
        }

        const employeeData = {
            lastname: lastName,
            firstname: firstName,
            tabelNumber: tabelNumber,
            positionGroup: this.state.selectedGroupId,
            secondname: form.secondname.value.trim(),
            position: form.position.value.trim(),
            Email: form.Email.value.trim(),
            EmailDescription: form.EmailDescription.value.trim(),
            Comment: form.Comment.value.trim()
        };

        const saveButton = $('#addEmployeeModal .btn-primary');
        const originalText = saveButton.html();
        saveButton.html('<span class="spinner-border spinner-border-sm"></span> Добавление...');
        saveButton.prop('disabled', true);

        try {
            await RusGuardAPI.addEmployee(employeeData);
            Utils.showToast('Сотрудник успешно добавлен', 'success');
            $('#addEmployeeModal').modal('hide');

            setTimeout(() => {
                if (this.state.selectedGroupId) {
                    this.loadEmployeesByGroup(this.state.selectedGroupId);
                }
            }, 500);
        } catch (error) {
            console.error('Ошибка добавления сотрудника:', error);
            Utils.showToast(`Ошибка добавления: ${error.message}`, 'danger');
        } finally {
            saveButton.html(originalText);
            saveButton.prop('disabled', false);
        }
    },

    // ============================================
    // УПРАВЛЕНИЕ ДОСТУПОМ
    // ============================================

    /**
     * Показ модального окна управления доступом
     */
    async showAccessModal() {
        if (!this.state.selectedEmployeeId) {
            Utils.showToast('Выберите сотрудника для управления доступом', 'warning');
            return;
        }

        $('#useParentAccess').prop('checked', false);

        try {
            const [allLevels, employeeLevels] = await Promise.all([
                RusGuardAPI.getAllAccessLevels(),
                RusGuardAPI.getAccessLevelsEmployee(this.state.selectedEmployeeId)
            ]);

            UIManager.renderAvailableAccessLevels(allLevels, employeeLevels);
            $('#accessModal').modal('show');
        } catch (error) {
            console.error('Ошибка загрузки уровней доступа:', error);
            Utils.showToast('Не удалось загрузить уровни доступа', 'danger');
        }
    },

    /**
     * Сохранение уровней доступа
     */
    async saveAccessLevels() {
        const useParentAccess = $('#useParentAccess').is(':checked');
        const selectedLevels = [];

        if (!useParentAccess) {
            $('.level-checkbox:checked').each(function () {
                selectedLevels.push($(this).val());
            });

            if (selectedLevels.length === 0) {
                Utils.showToast('Выберите хотя бы один уровень доступа', 'warning');
                return;
            }
        } else {
            selectedLevels.push("00000000-0000-0000-0000-000000000000");
        }

        const saveButton = $('#accessModal .btn-primary');
        const originalText = saveButton.html();
        saveButton.html('<span class="spinner-border spinner-border-sm"></span> Сохранение...');
        saveButton.prop('disabled', true);

        try {
            await RusGuardAPI.setAccessLevels(this.state.selectedEmployeeId, selectedLevels, useParentAccess);
            Utils.showToast('Уровни доступа успешно обновлены', 'success');
            $('#accessModal').modal('hide');

            if (this.state.selectedEmployeeId) {
                await this.loadAccessLevels(this.state.selectedEmployeeId);
            }
        } catch (error) {
            console.error('Ошибка сохранения уровней доступа:', error);
            Utils.showToast(`Ошибка сохранения уровней доступа: ${error.message}`, 'danger');
        } finally {
            saveButton.html(originalText);
            saveButton.prop('disabled', false);
        }
    },

    // ============================================
    // ПОИСК
    // ============================================

    /**
     * Выполнение поиска
     */
    async performSearch() {
        const fio = $('#searchFIO').val().trim();
        const tabel = $('#searchTabel').val().trim();

        if (!fio && !tabel) {
            Utils.showToast('Введите ФИО или табельный номер для поиска', 'warning');
            return;
        }

        if (tabel) {
            if (!/^\d+$/.test(tabel)) {
                Utils.showToast('Табельный номер должен содержать только цифры', 'warning');
                return;
            }

            this.state.searchMode = 'tabel';
            Utils.showLoading('#employeesList');

            try {
                const data = await RusGuardAPI.searchByTabelNumber(tabel);

                if (data.status === 'success' && data.data && Array.isArray(data.data) && data.data.length > 0) {
                    // Сохраняем данные найденных сотрудников
                    this.state.employeesData = data.data;
                    this.state.selectedGroupId = null;
                    $('#employeeGroupsTree').jstree('deselect_all');

                    // Отладочный вывод структуры данных первого сотрудника
                    console.log('=== Поиск по табельному ===');
                    console.log('Структура данных сотрудника:', JSON.stringify(data.data[0], null, 2));
                    console.log('Все ключи первого сотрудника:', Object.keys(data.data[0]));

                    if (!UIManager.employeesDataTable) UIManager.initEmployeesTable();
                    UIManager.employeesDataTable.clear();

                    data.data.forEach(emp => {
                        const row = UIManager.createEmployeeRow(emp, this.state.selectedEmployeeId);
                        UIManager.employeesDataTable.row.add($(row));
                    });

                    UIManager.employeesDataTable.draw();
                    Utils.showToast(`Найден ${data.data.length} сотрудник(а) по табельному номеру`, 'success');
                } else {
                    this.state.employeesData = null;
                    UIManager.showNoDataMessage();
                    Utils.showToast('Сотрудник с таким табельным номером не найден', 'info');
                }
            } catch (error) {
                console.error('Ошибка поиска по табельному:', error);
                Utils.showError('#employeesList', 'Ошибка поиска по табельному номеру');
            }

            return;
        }

        if (fio) {
            this.state.searchMode = 'fio';
            Utils.showLoading('#employeesList');

            const parts = fio.trim().split(/\s+/);

            try {
                const data = await RusGuardAPI.searchByFIO({
                    lastName: parts[0] || '',
                    firstName: parts.length > 1 ? parts[1] : '',
                    secondName: parts.length > 2 ? parts[2] : ''
                });

                if (data.status === 'success' && data.data && Array.isArray(data.data) && data.data.length > 0) {
                    // Сохраняем данные найденных сотрудников
                    this.state.employeesData = data.data;
                    this.state.selectedGroupId = null;
                    $('#employeeGroupsTree').jstree('deselect_all');

                    // Отладочный вывод структуры данных первого сотрудника
                    console.log('=== Поиск по ФИО ===');
                    console.log('Структура данных сотрудника:', JSON.stringify(data.data[0], null, 2));
                    console.log('Все ключи первого сотрудника:', Object.keys(data.data[0]));

                    if (!UIManager.employeesDataTable) UIManager.initEmployeesTable();
                    UIManager.employeesDataTable.clear();

                    data.data.forEach(emp => {
                        const row = UIManager.createEmployeeRow(emp, this.state.selectedEmployeeId);
                        UIManager.employeesDataTable.row.add($(row));
                    });

                    UIManager.employeesDataTable.draw();
                    Utils.showToast(`Найдено ${data.data.length} сотрудников по ФИО`, 'success');
                } else {
                    this.state.employeesData = null;
                    UIManager.showNoDataMessage();
                    Utils.showToast('Сотрудники с таким ФИО не найдены', 'info');
                }
            } catch (error) {
                console.error('Ошибка поиска по ФИО:', error);
                Utils.showError('#employeesList', 'Ошибка поиска по ФИО');
            }
        }
    },

    /**
     * Сброс поиска
     */
    resetSearch() {
        $('#searchFIO').val('');
        $('#searchTabel').val('');
        this.state.searchMode = null;
        this.state.selectedEmployeeId = null;
        this.state.selectedEmployeeData = null;
        this.state.employeesData = null;

        $('#accessLevelsList').empty();
        $('#passagesContainer').empty();
        $('#remoteWorkContainer').empty();
        $('#remoteWorkEmployeeInfo').text('Выберите сотрудника для просмотра удалённой работы');

        if (this.state.selectedGroupId) {
            this.loadEmployeesByGroup(this.state.selectedGroupId);
        } else {
            if (UIManager.employeesDataTable) {
                UIManager.employeesDataTable.clear().draw();
                UIManager.showNoDataMessage();
            }
        }

        Utils.showToast('Поиск сброшен, возвращено к текущей группе', 'info');
    },

    // ============================================
    // ОБНОВЛЕНИЕ РАЗДЕЛОВ
    // ============================================

    /**
     * Обновление левой секции
     */
    refreshLeftSection() {
        this.loadInitialData();
        this.state.selectedGroupId = null;
        this.state.selectedEmployeeId = null;
        this.state.selectedEmployeeData = null;
        this.state.employeesData = null;
        $('#employeesList').empty();
        $('#accessLevelsList').empty();
        $('#passagesContainer').empty();
        $('#remoteWorkContainer').empty();
        $('#remoteWorkEmployeeInfo').text('Выберите сотрудника для просмотра удалённой работы');

        if (UIManager.employeesDataTable) {
            UIManager.employeesDataTable.clear().draw();
        }
    },

    /**
     * Обновление центральной секции
     */
    async refreshCenterSection() {
        if (this.state.selectedGroupId) {
            await this.loadEmployeesByGroup(this.state.selectedGroupId);
        }
        if (this.state.selectedEmployeeId) {
            await this.loadAccessLevels(this.state.selectedEmployeeId);
        }
    },

    /**
     * Обновление правой секции
     */
    async refreshRightSection() {
        if (this.state.selectedEmployeeId) {
            await this.loadAccessLevels(this.state.selectedEmployeeId);
        }
    },

    /**
     * Загрузка отчетов
     */
    loadReports() {
        console.log('Загрузка отчетов...');
    },

    // ============================================
    // УДАЛЁННАЯ РАБОТА
    // ============================================

    /**
     * Инициализация полей дат для удалённой работы
     */
    initRemoteWorkDates() {
        const today = new Date().toISOString().split('T')[0];
        $('#remoteStartDate').val(today);
        $('#remoteEndDate').val(today);
    },

    /**
     * Поиск информации об удалённой работе
     */
    async searchRemoteWork() {
        // Проверяем, что выбран сотрудник
        if (!this.state.selectedEmployeeData) {
            Utils.showToast('Выберите сотрудника для поиска удалённой работы', 'warning');
            return;
        }

        const startDate = $('#remoteStartDate').val();
        const endDate = $('#remoteEndDate').val();

        // Валидация
        if (!startDate || !endDate) {
            Utils.showToast('Укажите период поиска', 'warning');
            return;
        }

        // Получаем табельный номер выбранного сотрудника
        const tabelNumber = this.state.selectedEmployeeData.Number ||
                            this.state.selectedEmployeeData.TabelNumber ||
                            this.state.selectedEmployeeData.number ||
                            this.state.selectedEmployeeData.tabelNumber;

        if (!tabelNumber) {
            Utils.showToast('У выбранного сотрудника не указан табельный номер', 'warning');
            return;
        }

        // Показываем загрузку
        $('#remoteWorkContainer').html(`
            <div class="text-center py-3 text-white-50">
                <div class="spinner-border spinner-border-sm me-2" role="status">
                    <span class="visually-hidden">Загрузка...</span>
                </div>
                Поиск данных...
            </div>
        `);

        // Формируем даты в ISO формате (начало и конец дня)
        const startDateISO = `${startDate}T00:00:00`;
        const endDateISO = `${endDate}T23:59:59`;

        try {
            const data = await RusGuardAPI.searchRemoteWork({
                searchType: 2, // По табельному номеру
                searchData: String(tabelNumber),
                startDate: startDateISO,
                endDate: endDateISO
            });

            UIManager.renderRemoteWorkResults(data);

            if (data && data.length > 0) {
                Utils.showToast(`Найдено ${data.length} записей`, 'success');
            } else {
                Utils.showToast('Записей не найдено', 'info');
            }
        } catch (error) {
            console.error('Ошибка поиска удалённой работы:', error);

            $('#remoteWorkContainer').html(`
                <div class="text-center py-3 text-warning">
                    <i class="bi bi-exclamation-triangle me-2"></i>
                    Ошибка поиска: ${Utils.escapeHtml(error.message)}
                </div>
            `);

            Utils.showToast(`Ошибка поиска: ${error.message}`, 'danger');
        }
    }
};

// Инициализация при загрузке документа
$(document).ready(() => {
    App.init();
});

// Экспорт в глобальную область видимости
window.App = App;
