/**
 * API клиент для СКУД RusGuard
 * @module api
 */

/**
 * Базовый URL для API запросов
 * @constant {string}
 */
const API_BASE_URL = '/api/rusguard/Employee';

/**
 * API клиент для взаимодействия с сервером RusGuard
 */
const RusGuardAPI = {
    /**
     * Получает список всех групп сотрудников
     * @returns {Promise<Object>} Данные о группах
     */
    async getEmployeeGroups() {
        const response = await fetch(`${API_BASE_URL}/getEmployeesGroups`);
        if (!response.ok) throw new Error('Ошибка загрузки групп');
        return response.json();
    },

    /**
     * Получает сотрудников по ID группы
     * @param {string} groupId - ID группы
     * @returns {Promise<Object>} Данные о сотрудниках
     */
    async getEmployeesByGroup(groupId) {
        const response = await fetch(`${API_BASE_URL}/getByGroupID?idGroup=${groupId}`);
        if (!response.ok) throw new Error('Ошибка загрузки сотрудников');
        return response.text().then(text => {
            try {
                return JSON.parse(text);
            } catch (e) {
                throw new Error('Ошибка парсинга данных');
            }
        });
    },

    /**
     * Получает данные сотрудника по ID
     * @param {string} employeeId - ID сотрудника
     * @returns {Promise<Object>} Данные сотрудника
     */
    async getEmployeeById(employeeId) {
        const response = await fetch(`${API_BASE_URL}/getById?idEmployee=${employeeId}`);
        if (!response.ok) throw new Error('Ошибка загрузки данных сотрудника');
        return response.json();
    },

    /**
     * Получает уровни доступа сотрудника
     * @param {string} employeeId - ID сотрудника
     * @returns {Promise<Array>} Список уровней доступа
     */
    async getAccessLevelsEmployee(employeeId) {
        const response = await fetch(`${API_BASE_URL}/getAccessLevelsEmployee?idEmployee=${employeeId}`);
        if (!response.ok) throw new Error('Ошибка загрузки уровней доступа');
        return response.json();
    },

    /**
     * Получает все доступные уровни доступа
     * @returns {Promise<Array>} Список всех уровней доступа
     */
    async getAllAccessLevels() {
        const response = await fetch(`${API_BASE_URL}/getAccessLevels`);
        if (!response.ok) throw new Error('Ошибка загрузки уровней доступа');
        return response.json();
    },

    /**
     * Получает проходы сотрудника за дату
     * @param {string} employeeId - ID сотрудника
     * @param {string} date - Дата в формате DD-MM-YYYY
     * @returns {Promise<Object>} Данные о проходах
     */
    async getPassagesByDate(employeeId, date) {
        const response = await fetch(`${API_BASE_URL}/getPassagesByDate?idEmployee=${employeeId}&dataPassages=${date}`);
        if (!response.ok) throw new Error('Ошибка загрузки проходов');
        return response.text().then(text => {
            try {
                return JSON.parse(text);
            } catch (e) {
                throw new Error('Ошибка парсинга данных проходов');
            }
        });
    },

    /**
     * Получает список должностей
     * @returns {Promise<Object>} Словарь должностей {ID: Name}
     */
    async getPositions() {
        const response = await fetch(`${API_BASE_URL}/getPositions`);
        if (!response.ok) throw new Error('Ошибка загрузки должностей');
        return response.json();
    },

    /**
     * Добавляет нового сотрудника
     * @param {Object} employeeData - Данные сотрудника
     * @returns {Promise<void>}
     */
    async addEmployee(employeeData) {
        const params = new URLSearchParams();

        // Обязательные параметры
        params.append('lastname', employeeData.lastname);
        params.append('firstname', employeeData.firstname);
        params.append('tabelNumber', employeeData.tabelNumber);
        params.append('positionGroup', employeeData.positionGroup);

        // Опциональные параметры
        if (employeeData.secondname) params.append('secondname', employeeData.secondname);
        if (employeeData.position) params.append('position', employeeData.position);
        if (employeeData.Email) params.append('Email', employeeData.Email);
        if (employeeData.EmailDescription) params.append('EmailDescription', employeeData.EmailDescription);
        if (employeeData.Comment) params.append('Comment', employeeData.Comment);

        // Пустые параметры для совместимости
        params.append('AdressReg', '');
        params.append('PassportIISUE', '');
        params.append('PassportNumber', '');

        const response = await fetch(`${API_BASE_URL}/addEmployee`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
            body: params.toString()
        });

        if (!response.ok) {
            if (response.status === 400) throw new Error('Ошибка валидации данных');
            throw new Error(`Ошибка сервера: ${response.status}`);
        }
    },

    /**
     * Сохраняет изменения сотрудника
     * @param {string} employeeId - ID сотрудника
     * @param {Object} employeeData - Данные сотрудника
     * @returns {Promise<Object>} Результат операции
     */
    async saveEmployee(employeeId, employeeData) {
        const response = await fetch(`${API_BASE_URL}/saveAcsEmployee?idEmployee=${employeeId}`, {
            method: 'POST',
            headers: {
                'accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(employeeData)
        });

        const responseText = await response.text();

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}. ${responseText}`);
        }

        try {
            return responseText ? JSON.parse(responseText) : { status: 'success' };
        } catch (e) {
            return { status: 'success' };
        }
    },

    /**
     * Удаляет сотрудника
     * @param {string} employeeId - ID сотрудника
     * @returns {Promise<Object>} Результат операции
     */
    async deleteEmployee(employeeId) {
        const response = await fetch(`${API_BASE_URL}/deleteEmployee?id=${employeeId}`, {
            method: 'DELETE',
            headers: { 'accept': 'application/json' }
        });

        if (!response.ok) {
            if (response.status === 400) {
                const text = await response.text();
                throw new Error(text || 'Ошибка 400 при удалении');
            }
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const text = await response.text();
        try {
            return text ? JSON.parse(text) : { status: 'success' };
        } catch (e) {
            return { status: 'success' };
        }
    },

    /**
     * Устанавливает статус блокировки сотрудника
     * @param {string} employeeId - ID сотрудника
     * @param {boolean} isLocked - Статус блокировки
     * @returns {Promise<void>}
     */
    async setEmployeeLock(employeeId, isLocked) {
        const response = await fetch(`${API_BASE_URL}/setLocked?idEmployee=${employeeId}&flag=${isLocked}`, {
            method: 'POST'
        });

        if (!response.ok) throw new Error('Ошибка изменения статуса');
    },

    /**
     * Устанавливает уровни доступа сотрудника
     * @param {string} employeeId - ID сотрудника
     * @param {Array<string>} accessLevelIds - Массив ID уровней доступа
     * @param {boolean} useParentAccess - Использовать родительские уровни
     * @returns {Promise<Object>} Результат операции
     */
    async setAccessLevels(employeeId, accessLevelIds, useParentAccess) {
        const requestData = { guid: accessLevelIds };

        const response = await fetch(
            `${API_BASE_URL}/setAccessLevelEmployee?employeeID=${employeeId}&isUseParentAccessLevel=${useParentAccess}`,
            {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json'
                },
                body: JSON.stringify(requestData)
            }
        );

        const responseText = await response.text();

        if (!response.ok) {
            try {
                const errorData = responseText ? JSON.parse(responseText) : {};
                throw new Error(errorData.message || `HTTP error! status: ${response.status}`);
            } catch (e) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
        }

        try {
            return responseText ? JSON.parse(responseText) : { status: 'success' };
        } catch (e) {
            return { status: 'success' };
        }
    },

    /**
     * Поиск сотрудника по табельному номеру
     * @param {string} tabelNumber - Табельный номер
     * @returns {Promise<Object>} Результат поиска
     */
    async searchByTabelNumber(tabelNumber) {
        const response = await fetch(`${API_BASE_URL}/getByTabelNumber?tabelNumber=${encodeURIComponent(tabelNumber)}`);
        if (!response.ok) throw new Error('Ошибка поиска');
        return response.json();
    },

    /**
     * Поиск сотрудника по ФИО
     * @param {Object} fio - Объект с полями lastName, firstName, secondName
     * @returns {Promise<Object>} Результат поиска
     */
    async searchByFIO(fio) {
        const params = new URLSearchParams();
        if (fio.lastName) params.append('lastName', fio.lastName);
        if (fio.firstName) params.append('firstName', fio.firstName);
        if (fio.secondName) params.append('secondName', fio.secondName);
        params.append('isLock', 'false');

        const response = await fetch(`${API_BASE_URL}/getByFIO?${params.toString()}`);
        if (!response.ok) throw new Error('Ошибка поиска');
        return response.json();
    },

    /**
     * Поиск информации об удалённой работе
     * @param {Object} params - Параметры поиска
     * @param {number} params.searchType - Тип поиска: 1 - по логину, 2 - по табельному номеру
     * @param {string} params.searchData - Логин или табельный номер
     * @param {string} params.startDate - Дата начала (ISO формат)
     * @param {string} params.endDate - Дата окончания (ISO формат)
     * @returns {Promise<Array>} Массив записей об удалённой работе
     */
    async searchRemoteWork(params) {
        const REMOTE_WORK_API_URL = 'http://DOC-APP8:4842/CDvService/86d8e4719c0cf1119f353a68ddb4ef9b/RemoteWork/SearchRemoteWorkInfo';

        const requestBody = {
            SearchType: params.searchType,
            SearchData: params.searchData,
            StartDate: params.startDate,
            EndDate: params.endDate
        };

        const response = await fetch(REMOTE_WORK_API_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json; charset=utf-8',
                'Accept': 'application/json'
            },
            body: JSON.stringify(requestBody)
        });

        if (!response.ok) {
            throw new Error(`Ошибка поиска удалённой работы: ${response.status}`);
        }

        return response.json();
    }
};

// Экспорт в глобальную область видимости
window.RusGuardAPI = RusGuardAPI;
