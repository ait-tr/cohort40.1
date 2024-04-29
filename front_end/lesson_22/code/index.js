
// пример функции с ключевым словом async (возвращает промис)
// const foo = async () => {
//     return 'hello';
// }

// // вызов async функции 
// foo()
//     .then(data => {
//         console.log(data);
//     })

// -----------------

// пример с ключевым словом await
// const foo = async () => {
//     const p = new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve('hello');
//         }, 1000);

//     });

//     // ждем выполнение промиса
//     const res = await p;

//     console.log(res);
// }

// foo();

// ----------------

// const p = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve('hello');
//     }, 1000);

// });

// // ОШИБКА  SyntaxError: await is only valid in async functions and the top level bodies of modules
// const res = await p;

// --------------

// пример классической фнукции с ключ словом async
// async function foo() {
//     const p = new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve('hello');
//         }, 1000);

//     });

//     const res = await p;
//     console.log(res);
// }

// foo();

// ---------------

// 
// const foo = async () => {
//     const p = new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve('hello');
//         }, 1000);

//     });

//     // ждем выполнение промиса
//     const res = await p;

//     return res;
// }

// // результат вызова  asycn функции будет промисом не смотря на то что внутри нее вызывается  await  и возвращается примитивный результат
// const res = foo();

// ----------------

const loadDataAsync = async () => {
    const promise1 = new Promise((resolve, reject) => {
        setTimeout(() => resolve('Данные'), 1000);
    });

    return promise1;
}

const analyseAsync = async (data) => {
    const promise1 = new Promise((resolve, reject) => {
        console.log(data);
        setTimeout(() => resolve('Проанализированные данные '), 1000);
    });

    return promise1;
}

const saveDataAsync = async (data) => {
    const promise1 = new Promise((resolve, reject) => {
        console.log(data);
        setTimeout(() => resolve('Сохраненные сохранены '), 1000);
    });
    return promise1;
}

// вызов через then
// const main = () => {
//     loadDataAsync()
//         .then(data => {
//             return analyseAsync(data);
//         }).then(data => {
//             return saveDataAsync(data);
//         }).then(data => {
//             console.log(data);
//         });
// }
// main();


// вызов асинхронных функция похоже на синхронынй код
// const main = async () => {
//     const data1 = await loadDataAsync();
//     const data2 = await analyseAsync(data1);
//     const data3 = await saveDataAsync(data2);
//     console.log(data3);
// }

// main();

// -----------

const fooAsync = async () => {

    const promise1 = new Promise((resolve, reject) => {
        // вызываем  reject на промисе
        setTimeout(() => reject('ERROR111'), 1000);
    });

    // если промис реджектит что-то - то await - выбросит исключение ( тут будет ошибка )
    // const result = await promise1;

    // чтобы обработать исключение нужно блок с  await - завернить в try catch
    try {
        const result = await promise1;
        console.log(result);
    } catch (err) {
        console.log('Произошла ошибка');
    }
}



