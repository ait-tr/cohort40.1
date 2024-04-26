// const p1 = new Promise(....)

// debugger;

// // простой пример промиса
// const p1 = new Promise((resolve, reject) => {
//     console.log('Загрузка данных');
//     resolve('Загруженные данные');
// });

// // вызов объекта промиса
// p1
//     .then(data => {
//         console.log('Анализ данных');
//         return 'Проанализированные даныне';
//     })
//     .then((data) => {
//         console.log('Обработка данных');
//         return 'Обработанные данные';
//     });

// console.log('END');

// -----------------

// простой пример промиса c timeout
// const p1 = new Promise((resolve, reject) => {
//     console.log('Начало загрузки данных...');
//     setTimeout(() => {
//         resolve('Загруженыне данные');
//     }, 1000);
// });

// // вызов объекта промиса
// p1
//     .then(data => {
//         console.log('Анализ данных: ', data);
//         return 'Проанализированные даныне';
//     })
//     .then((data) => {
//         console.log('Обработка данных');
//         return 'Обработанные данные';
//     });

// -------------

// // простой пример с reject
// const p1 = new Promise((resolve, reject) => {
//     console.log('Начало загрузки данных...');
//     setTimeout(() => {
//         // resolve('Загруженыне данные');
//         reject('Ошибка загрузки данных');
//     }, 1000);
// });

// // вызов объекта промиса
// p1
//     .then(data => {
//         console.log('Анализ данных: ', data);
//         return 'Проанализированные даныне';
//     }).then((data) => {
//         console.log('Обработка данных');
//         return 'Обработанные данные';
//     }).catch((err) => {
//         console.log('ERROR1111: ', err);
//     })

// ----------------

// // пример с reject с try catch (так часто пишут когда создают промисы сами)
// const p1 = new Promise((resolve, reject) => {
//     console.log('Начало загрузки данных...');
//     setTimeout(() => {
//         try {
//             console.log('Начало загрузки данных...');
//             // throw new Error('Ошибка загрузки данных');
//             resolve('Данные');
//         } catch (err) {
//             reject(err);
//         }

//     }, 1000);
// });

// // вызов объекта промиса
// p1
//     .then(data => {
//         console.log('Анализ данных: ', data);
//         // ошибка в блоке try - переводит выполненике кода в ближайший бок catch
//         throw new Error('error then 1'); //!!!!!
//         return 'Проанализированные даныне';
//     }).then((data) => {
//         console.log('Обработка данных');
//         return 'Обработанные данные';
//     }).catch((err) => {
//         console.log('ERROR1111: ', err);
//     })

// ---------------

const calculateAsync = (v1, v2) => {

    return new Promise((res, rej) => {
        setTimeout(() => {
            if (typeof v1 !== 'number' || typeof v2 !== 'number') {
                rej('Должны быть числа');
            } else {
                res(v1 + v2);
            }
        }, 1000);
    });
}

calculateAsync(1, 'helo')
    .then(data => {
        console.log(data);
    }).catch(err => {
        console.log('ERROR1111', err);
    });


    