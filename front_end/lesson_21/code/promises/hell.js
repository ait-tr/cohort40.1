// Пример callback hell в JavaScript
function requestData(callback) {
    setTimeout(() => {
        console.log("Запрос данных...");
        callback('данные');
    }, 1000);
}

function parseData(data, callback) {
    setTimeout(() => {
        console.log("Анализ данных: " + data);
        callback('анализированные данные');
    }, 1000);
}

function processData(processedData, callback) {
    setTimeout(() => {
        console.log("Обработка данных: " + processedData);
        callback('обработанные данные');
    }, 1000);
}

function displayData(data) {
    setTimeout(() => {
        console.log("Отображение данных: " + data);
    }, 1000);
}

// Вызов функций с вложенными обратными вызовами
requestData(function (data) {
    parseData(data, function (processedData) {
        processData(processedData, function (finalData) {
            displayData(finalData);
        });
    });
});