/**
 * Управление UI компонентами СКУД RusGuard
 * @module ui
 */

/**
 * Менеджер UI компонентов
 */
const UIManager = {
    // Ссылка на DataTable
    employeesDataTable: null,

    /**
     * Инициализирует DataTable для сотрудников
     */
    initEmployeesTable() {
        if (this.employeesDataTable) {
            this.employeesDataTable.destroy();
        }

        this.employeesDataTable = $('#employeesTable').DataTable({
            paging: true,
            pageLength: 25,
            lengthChange: false,
            searching: true,
            ordering: true,
            info: true,
            autoWidth: false,
            responsive: false,
            scrollY: "100%",
            scrollCollapse: true,
            scrollX: false,
            deferRender: true,
            scroller: true,
            language: {
                url: "//cdn.datatables.net/plug-ins/1.13.6/i18n/ru.json"
            },
            dom: '<"top"f>rt<"bottom"ilp><"clear">',
            order: [],
            columnDefs: [
                { orderable: true, targets: [0, 1, 2] },
                { orderable: false, targets: [3] }
            ],
            initComplete: function () {
                this.api().columns.adjust();
            }
        });

        this.adjustTableHeight();
    },

    /**
     * Корректирует высоту таблицы
     */
    adjustTableHeight() {
        setTimeout(() => {
            const $wrapper = $('#employeesTable_wrapper');
            const $scrollBody = $wrapper.find('.dataTables_scrollBody');

            if ($scrollBody.length) {
                const wrapperHeight = $wrapper.height();
                const scrollHeadHeight = $wrapper.find('.dataTables_scrollHead').height() || 0;
                const topHeight = $wrapper.find('.top').height() || 0;
                const bottomHeight = $wrapper.find('.bottom').height() || 0;

                const availableHeight = wrapperHeight - scrollHeadHeight - topHeight - bottomHeight - 10;

                if (availableHeight > 100) {
                    $scrollBody.css('height', availableHeight + 'px');
                }
            }
        }, 200);
    },

    /**
     * Создаёт HTML строки для таблицы сотрудников
     * @param {Object} employee - Данные сотрудника
     * @param {string|null} selectedEmployeeId - ID выбранного сотрудника
     * @returns {string} HTML строка таблицы
     */
    createEmployeeRow(employee, selectedEmployeeId) {
        const employeeId = employee.ID || employee.id || employee.Id || `emp_${Date.now()}`;
        const lastName = employee.LastName || employee.lastName || '';
        const firstName = employee.FirstName || employee.firstName || '';
        const secondName = employee.SecondName || employee.secondName || '';
        const tabelNumber = employee.Number || employee.Number || '';
        const isLocked = employee.IsLocked || employee.isLocked || false;

        const statusClass = isLocked ? 'status-locked' : 'status-active';
        const statusText = isLocked ? 'Заблокирован' : 'Активен';
        const lockIcon = isLocked ? 'bi-lock-fill' : 'bi-unlock-fill';
        const lockButtonClass = isLocked ? 'btn-success' : 'btn-danger';
        const lockButtonIcon = isLocked ? 'bi-unlock' : 'bi-lock';
        const rowClass = employeeId === selectedEmployeeId ? 'table-primary' : '';

        return `
            <tr data-employee-id="${employeeId}" onclick="App.selectEmployee('${employeeId}')" class="${rowClass}">
                <td>
                    <div class="d-flex align-items-center">
                        <div class="employee-avatar">
                            ${Utils.getInitials(lastName, firstName)}
                        </div>
                        <div>
                            <strong>${Utils.escapeHtml(lastName)} ${Utils.escapeHtml(firstName)}</strong>
                            ${secondName ? `<br><small>${Utils.escapeHtml(secondName)}</small>` : ''}
                        </div>
                    </div>
                </td>
                <td>${Utils.escapeHtml(tabelNumber) || 'Не указан'}</td>
                <td><span class="${statusClass}"><i class="bi ${lockIcon}"></i> ${statusText}</span></td>
                <td>
                    <button class="btn btn-warning btn-sm action-btn" onclick="App.editEmployee('${employeeId}', event)">
                        <i class="bi bi-pencil"></i>
                    </button>
                    <button class="btn ${lockButtonClass} btn-sm action-btn"
                            onclick="App.toggleEmployeeLock('${employeeId}', ${!isLocked}, event)">
                        <i class="bi ${lockButtonIcon}"></i>
                    </button>
                </td>
            </tr>
        `;
    },

    /**
     * Отображает список сотрудников в таблице
     * @param {Object} data - Данные о сотрудниках
     */
    renderEmployeesList(data) {
        if (!this.employeesDataTable) {
            this.initEmployeesTable();
            setTimeout(() => this.renderEmployeesList(data), 100);
            return;
        }

        this.employeesDataTable.clear();

        if (!data) {
            this.showNoDataMessage();
            return;
        }

        // Извлекаем массив сотрудников
        let employeesArray = [];
        if (Array.isArray(data)) {
            employeesArray = data;
        } else if (data.employees && Array.isArray(data.employees)) {
            employeesArray = data.employees;
        } else if (data.data && Array.isArray(data.data)) {
            employeesArray = data.data;
        } else if (data.result && Array.isArray(data.result)) {
            employeesArray = data.result;
        } else {
            console.warn('Неизвестный формат данных сотрудников:', data);
            this.showNoDataMessage();
            return;
        }

        if (employeesArray.length === 0) {
            this.showNoDataMessage();
            return;
        }

        employeesArray.forEach(employee => {
            const row = this.createEmployeeRow(employee, App.state.selectedEmployeeId);
            this.employeesDataTable.row.add($(row));
        });

        this.employeesDataTable.order([]).draw();
        this.adjustTableHeight();
    },

    /**
     * Показывает сообщение об отсутствии данных
     */
    showNoDataMessage() {
        if (!this.employeesDataTable) {
            this.initEmployeesTable();
        }

        this.employeesDataTable.clear();
        this.employeesDataTable.row.add([
            '<div class="text-center py-3" colspan="4">Нет сотрудников в выбранной группе</div>',
            '',
            '',
            ''
        ]).draw();
    },

    /**
     * Отображает уровни доступа сотрудника
     * @param {Array} levels - Массив уровней доступа
     */
    renderAccessLevels(levels) {
        const container = $('#accessLevelsList');

        if (!levels || !Array.isArray(levels)) {
            container.html('<div class="alert alert-info">Нет доступных уровней доступа</div>');
            return;
        }

        if (levels.length === 0) {
            container.html('<div class="alert alert-info">Нет доступных уровней доступа</div>');
            return;
        }

        let html = '';
        levels.forEach(level => {
            const endDate = level.EndDate ? new Date(level.EndDate).toLocaleDateString() : 'Не ограничен';
            html += `
                <div class="card mb-2">
                    <div class="card-body p-3">
                        <h6 class="card-title mb-1">${Utils.escapeHtml(level.Name || 'Без названия')}</h6>
                        ${level.Description ? `<p class="card-text small text-muted mb-1">${Utils.escapeHtml(level.Description)}</p>` : ''}
                        <div class="d-flex justify-content-between align-items-center">
                            <span class="badge bg-secondary">Точек доступа: ${level.NumberOfAccessPoints || 0}</span>
                            <span class="small">До: ${endDate}</span>
                        </div>
                    </div>
                </div>
            `;
        });

        container.html(html);
    },

    /**
     * Отображает проходы сотрудника
     * @param {Object} data - Данные о проходах
     */
    renderPassages(data) {
        const container = $('#passagesContainer');

        if (!data || !data.data || (Array.isArray(data.data) && data.data.length === 0)) {
            container.html('<div class="text-center py-3">Нет данных о проходах за выбранную дату</div>');
            return;
        }

        // Заголовок с информацией о сотруднике
        let headerHtml = '';
        if (data.fio) {
            headerHtml += `
                <div class="passage-info mb-3 p-2 bg-light rounded">
                    ${Utils.escapeHtml(data.fio) ? `<div class="fw-bold">${Utils.escapeHtml(data.fio)}:   <small>${Utils.escapeHtml(data.department)}</small></div>` : ''}
                </div>
            `;
        }

        // Сортируем проходы по времени
        const sortedPassages = [...data.data].sort((a, b) => {
            if (a.DataTime && b.DataTime) {
                try {
                    const dateA = Utils.parseCustomDate(a.DataTime);
                    const dateB = Utils.parseCustomDate(b.DataTime);
                    return dateA - dateB;
                } catch (e) {
                    return 0;
                }
            }
            return 0;
        });

        let html = `<div class="text-center small text-muted mb-2">Найдено проходов: ${sortedPassages.length}</div>` + headerHtml;

        sortedPassages.forEach(passage => {
            let time = '--:--';
            let dateStr = '';
            if (passage.DataTime) {
                try {
                    const [datePart, timePart] = passage.DataTime.split(' ');
                    time = timePart || '--:--';
                    dateStr = datePart || '';
                } catch (e) {
                    console.warn('Ошибка парсинга времени:', e);
                }
            }

            const eventType = passage.MESSAGE || passage.SUBTYPE || passage.TYPE || '';
            const eventClass = Utils.getEventClass(eventType);

            html += `
                <div class="passage-event ${eventClass} d-flex align-items-center flex-nowrap gap-2">
                    <div class="flex-shrink-0 d-flex align-items-baseline gap-1">
                        <span class="fw-bold">${time}</span>
                        ${dateStr ? `<span class="text-muted small">${dateStr}</span>` : ''}
                    </div>
                    <div class="badge flex-shrink-0 ${eventClass === 'entrance' ? 'bg-success' : eventClass === 'exit' ? 'bg-danger' : 'bg-warning'}"></div>
                    ${passage.MESSAGE ? `<div class="text-truncate flex-grow-1" style="min-width: 0;">${Utils.escapeHtml(passage.MESSAGE)}</div>` : '<div class="flex-grow-1"></div>'}
                </div>
            `;
        });

        container.html(html);
    },

    /**
     * Отображает таблицу уровней доступа в модальном окне
     * @param {Array} levels - Массив уровней доступа
     */
    renderEmployeeAccessLevelsTable(levels) {
        const tbody = $('#employeeAccessLevelsBody');
        const countSpan = $('#accessLevelsCount');

        if (!levels || !Array.isArray(levels) || levels.length === 0) {
            tbody.html(`
                <tr>
                    <td colspan="5" class="text-center py-3 text-muted">
                        Нет доступных уровней доступа
                    </td>
                </tr>
            `);
            countSpan.text('0');
            return;
        }

        let html = '';
        levels.forEach(level => {
            let endDate = 'Не ограничен';
            if (level.EndDate && level.EndDate !== 'null') {
                try {
                    const date = new Date(level.EndDate);
                    if (!isNaN(date.getTime())) {
                        endDate = date.toLocaleDateString('ru-RU');
                    }
                } catch (e) {
                    endDate = level.EndDate;
                }
            }

            html += `
                <tr>
                    <td class="small text-muted">${Utils.escapeHtml(level.ID || '').substring(0, 8)}...</td>
                    <td><strong>${Utils.escapeHtml(level.Name || 'Без названия')}</strong></td>
                    <td>
                        <span class="badge bg-primary">
                            ${level.NumberOfAccessPoints || 0}
                        </span>
                    </td>
                    <td>${Utils.escapeHtml(level.Description || '')}</td>
                    <td>${endDate}</td>
                </tr>
            `;
        });

        tbody.html(html);
        countSpan.text(levels.length);
    },

    /**
     * Отображает доступные уровни доступа в модальном окне
     * @param {Array} levels - Все уровни доступа
     * @param {Array} currentLevels - Текущие уровни доступа сотрудника
     */
    renderAvailableAccessLevels(levels, currentLevels = []) {
        const container = $('#availableAccessLevels');
        container.empty();

        if (!levels || !Array.isArray(levels) || levels.length === 0) {
            container.html('<div class="text-muted">Нет доступных уровней доступа</div>');
            return;
        }

        const currentLevelIds = new Set();
        if (currentLevels && Array.isArray(currentLevels)) {
            currentLevels.forEach(level => {
                if (level.ID) currentLevelIds.add(level.ID);
            });
        }

        let html = '';
        levels.forEach(level => {
            const isChecked = currentLevelIds.has(level.ID);
            html += `
                <div class="form-check">
                    <input class="form-check-input level-checkbox" type="checkbox"
                           value="${level.ID}"
                           id="level_${level.ID}"
                           ${isChecked ? 'checked' : ''}>
                    <label class="form-check-label" for="level_${level.ID}">
                        ${level.Name || 'Без названия'}
                        ${level.Description ? `<br><small class="text-muted">${level.Description}</small>` : ''}
                    </label>
                </div>
                <hr class="my-2">
            `;
        });

        container.html(html);
        this.updateLevelCheckboxesState();
    },

    /**
     * Обновляет состояние чекбоксов уровней доступа
     */
    updateLevelCheckboxesState() {
        const useParentAccess = $('#useParentAccess').is(':checked');
        $('.level-checkbox').prop('disabled', useParentAccess);

        if (useParentAccess) {
            $('.level-checkbox').prop('checked', false);
        }
    },

    /**
     * Восстанавливает HTML формы редактирования
     */
    restoreEditForm() {
        $('#editEmployeeForm').html(`
            <input type="hidden" id="editEmployeeId">
            <div class="row">
                <div class="col-md-4">
                    <div class="mb-3">
                        <label class="form-label">Фамилия *</label>
                        <input type="text" class="form-control" id="editLastName" required>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="mb-3">
                        <label class="form-label">Имя *</label>
                        <input type="text" class="form-control" id="editFirstName" required>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="mb-3">
                        <label class="form-label">Отчество</label>
                        <input type="text" class="form-control" id="editSecondName">
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label class="form-label">Табельный номер *</label>
                        <input type="text" class="form-control" id="editTabelNumber" required>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label class="form-label">Должность</label>
                        <select class="form-control" id="editPositionSelect">
                            <option value="">Загрузка должностей...</option>
                        </select>
                        <small class="text-muted">Или введите GUID вручную:</small>
                        <input type="text" class="form-control mt-1" id="editPosition" placeholder="GUID должности">
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label class="form-label">Серия паспорта</label>
                        <input type="text" class="form-control" id="editPassportIISUE">
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mb-3">
                        <label class="form-label">Номер паспорта</label>
                        <input type="text" class="form-control" id="editPassportNumber">
                    </div>
                </div>
            </div>
        `);
    }
};

// Экспорт в глобальную область видимости
window.UIManager = UIManager;
