// Пример использования промисов вместо callback hell в JavaScript
function requestData() {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log("Запрос данных...");
            resolve('данные');
        }, 1000);
    });
}

function parseData(data) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log("Анализ данных: " + data);
            resolve('анализированные данные');
        }, 1000);
    });
}

function processData(processedData) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log("Обработка данных: " + processedData);
            resolve('обработанные данные');
        }, 1000);
    });
}

function displayData(data) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log("Отображение данных: " + data);
            resolve();
        }, 1000);
    });
}

// Цепочка промисов для последовательного выполнения задач
requestData()
    .then(parseData)
    .then(processData)
    .then(displayData)
    .catch((error) => {
        console.error("Произошла ошибка:", error);
    });


