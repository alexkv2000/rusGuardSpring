/**
 * Вспомогательные функции для СКУД RusGuard
 * @module utils
 */

/**
 * Экранирует HTML-символы для предотвращения XSS
 * @param {string} text - Текст для экранирования
 * @returns {string} Экранированный текст
 */
function escapeHtml(text) {
    if (!text) return '';
    const div = document.createElement('div');
    div.textContent = text;
    return div.innerHTML;
}

/**
 * Возвращает инициалы из фамилии и имени
 * @param {string} lastName - Фамилия
 * @param {string} firstName - Имя
 * @returns {string} Инициалы (2 заглавные буквы)
 */
function getInitials(lastName, firstName) {
    if (!lastName && !firstName) return '??';
    const first = (lastName && lastName.charAt(0)) || '';
    const second = (firstName && firstName.charAt(0)) || '';
    return (first + second).toUpperCase();
}

/**
 * Форматирует дату для API (DD-MM-YYYY)
 * @param {string} dateString - Дата в формате YYYY-MM-DD
 * @returns {string} Дата в формате DD-MM-YYYY
 */
function formatDateForAPI(dateString) {
    const date = new Date(dateString);
    const day = String(date.getDate()).padStart(2, '0');
    const month = String(date.getMonth() + 1).padStart(2, '0');
    const year = date.getFullYear();
    return `${day}-${month}-${year}`;
}

/**
 * Определяет CSS-класс для типа события прохода
 * @param {string} eventType - Тип события
 * @returns {string} CSS-класс ('entrance', 'exit', 'denied')
 */
function getEventClass(eventType) {
    if (!eventType) return '';

    const type = String(eventType).toLowerCase();

    if (type.includes('вход') || type.includes('entry') || type.includes('accesspointentry')) {
        return 'entrance';
    }

    if (type.includes('выход') || type.includes('exit') || type.includes('accesspointexit')) {
        return 'exit';
    }

    return 'denied';
}

/**
 * Возвращает текстовое описание типа события
 * @param {string} eventType - Тип события
 * @returns {string} Текстовое описание
 */
function getEventText(eventType) {
    if (!eventType) return 'Событие';

    const type = String(eventType).toLowerCase();

    if (type.includes('вход') || type.includes('entry') || type.includes('accesspointentry')) {
        return 'Вход';
    }

    if (type.includes('выход') || type.includes('exit') || type.includes('accesspointexit')) {
        return 'Выход';
    }

    return 'Событие';
}

/**
 * Показывает индикатор загрузки в указанном контейнере
 * @param {string} selector - CSS-селектор контейнера
 */
function showLoading(selector) {
    $(selector).html(`
        <div class="loading-container">
            <div class="text-center py-5">
                <div class="spinner-border text-primary" role="status">
                    <span class="visually-hidden">Загрузка...</span>
                </div>
                <p class="mt-2">Загрузка данных...</p>
            </div>
        </div>
    `);
}

/**
 * Показывает сообщение об ошибке в указанном контейнере
 * @param {string} selector - CSS-селектор контейнера
 * @param {string} message - Текст сообщения об ошибке
 */
function showError(selector, message) {
    $(selector).html(`
        <div class="error-container">
            <div class="alert alert-danger" role="alert">
                <i class="bi bi-exclamation-triangle me-2"></i>
                ${escapeHtml(message)}
            </div>
        </div>
    `);
}

/**
 * Показывает всплывающее уведомление (toast)
 * @param {string} message - Текст сообщения
 * @param {string} [type='info'] - Тип уведомления ('success', 'danger', 'warning', 'info')
 */
function showToast(message, type = 'info') {
    const toastId = 'toast-' + Date.now();
    const toast = `
        <div id="${toastId}" class="position-fixed bottom-0 end-0 p-3" style="z-index: 1050">
            <div class="toast align-items-center text-white bg-${type} border-0" role="alert">
                <div class="d-flex">
                    <div class="toast-body">
                        ${escapeHtml(message)}
                    </div>
                    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast"></button>
                </div>
            </div>
        </div>
    `;

    $('body').append(toast);
    const toastElement = $(`#${toastId} .toast`);
    const bsToast = new bootstrap.Toast(toastElement);
    bsToast.show();

    toastElement.on('hidden.bs.toast', function () {
        $(`#${toastId}`).remove();
    });
}

/**
 * Парсит дату из формата "D-M-YYYY H:mm:ss"
 * @param {string} dateStr - Строка даты
 * @returns {Date} Объект Date
 */
function parseCustomDate(dateStr) {
    const [datePart, timePart] = dateStr.split(' ');
    const [day, month, year] = datePart.split('-').map(Number);
    const [hours, minutes, seconds] = timePart.split(':').map(Number);
    return new Date(year, month - 1, day, hours, minutes, seconds);
}

/**
 * Экспортирует утилиты для использования в других модулях
 */
window.Utils = {
    escapeHtml,
    getInitials,
    formatDateForAPI,
    getEventClass,
    getEventText,
    showLoading,
    showError,
    showToast,
    parseCustomDate
};
