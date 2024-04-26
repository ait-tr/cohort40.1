
// синтаксис try catch
// try {
//     console.log('success');
// } catch (error) {
//     console.log('error');
// }

// пример с ошибкой
// const a = undefined;

// try {
//     console.log('start');
//     a.name = 100
//     console.log('success');
// } catch (error) {
//     console.log('error11111: ', error.message);
// }

// -----------------


// пример с finally (отработает всегда)
// const a = undefined;

// try {
//     console.log('start');
//     a.name = 100
//     console.log('success');
// } catch (error) {
//     console.log('error11111: ', error.message);
// } finally {
//     console.log('finally');
// }

// -----------------------

// const calculate = (a, b) => {

//     if (typeof a !== 'number' || typeof b !== 'number') {
//         // выбрасываем исключение сами
//         throw new Error('аргументы должны быть числами');
//     }

//     return a + b;
// }


// const res = calculate(1, 'test');
// console.log(res);

// ---------------------------

// const calculate = (a, b) => {

//     if (typeof a !== 'number' || typeof b !== 'number') {
//         // выбрасываем исключение сами
//         // выбрасываем как исключение число (так не нужно делать)
//         throw 1111;
//     }

//     return a + b;
// }


// const res = calculate(1, 'test');
// console.log(res);

// ----------------------
// const calculate = (a, b) => {

//     if (typeof a !== 'number' || typeof b !== 'number') {
//         // throw new Error('xxxxxx');
//         // выброс ошибки как объект
//         throw {
//             type: 'my-error',
//             description: 'xxxxxxx'
//         }
//     }

//     return a + b;
// }


// const res = calculate(1, 'test');
// console.log(res);

// -----------------------

// const calculate = (a, b) => {

//     if (typeof a !== 'number' || typeof b !== 'number') {    
//         // выброс ошибки с доп полями    
//         const error1 = new Error('произошла ошибка111');

//         error1.type = 'my-error';
//         error1.description = 'xxxxxxxxxx';

//         throw error1;
//     }

//     return a + b;
// }


// const res = calculate(1, 'test');
// console.log(res);

// -----------------

// фабричный метод созданя объекта ошибки
// const createError = ({ name, description, type, }) => {
//     const error1 = new Error('произошла ошибка111');
//     error1.name = name;
//     error1.description = description;
//     error1.type = type;
// }


// const calculate = (a, b) => {

//     if (typeof a !== 'number' || typeof b !== 'number') {
//         const error = createError({ name: 'err', description: 'descr', type: 'type1' });
//         throw error;
//     }

//     return a + b;
// }


// const res = calculate(1, 'test');
// console.log(res);


// ----------------

const calculate = (a, b) => {

    if (typeof a !== 'number' || typeof b !== 'number') {
        throw new Error('а и b должны быть числами');
    }

    return a + b;
}


try {
    const res = calculate(1, 'test');
    console.log(res);
} catch (err) {
    console.log('ERROR1111: ', err.message);
    // проброс ошибки выше
    throw new Error('обработать ошибку не удалось, попробуйте снова');
}

console.log('END SUCCESS');

