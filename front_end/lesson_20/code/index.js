
// отложенный вызов стрелочной фукнции через 3 секунды
// setTimeout(() => {
//     console.log('test');
// }, 3000);


// const foo = () => {
//     console.log('hello timeout');
// }

// // вариант с отдельной функцией
// setTimeout(foo, 1000);

// альтернативный синтаксис вызова каллбек функции в setTimout ( так делать не стоит - плохая практика)
// setTimeout("console.log('hello timeout')", 1000);
// setTimeout("alert('hello timeout')", 1000);



// const foo = (text, test2) => {
//     console.log('hello ' + text + test2);
// }

// вызов функции с аргументом вариант 1
// setTimeout(() => {
//     foo('hello');
// }, 1000);

// вызов функции с 2 параметрами , вариант 2
// setTimeout(foo, 1000, 'test', 'test2');

// функция setTiomout возвращает идентификатор таймаута (можно его использовать чтобы отменить таймаут)
// const timeoutId = setTimeout(() => {
//     console.log('test1');
// }, 1000);

// // отмена таймаута
// clearTimeout(timeoutId);

// -----------------------------

// пример вызова setInterval - вызывает каллбек функцию каждую секунду
// setInterval(() => {
//     console.log('hello interval');
// }, 1000);

// пример со счетчиком
// let counter = 0;
// const intervalId = setInterval(() => {
//     counter += 1;
//     console.log(counter);
//     if (counter >= 10) {
//         clearInterval(intervalId);
//     }
// }, 1000);

// console.log('before foo2');

// const foo2 = () => {
//     console.log('before interval');

//     let counter = 0;
//     const intervalId = setInterval(() => {
//         // if (counter === 0) {
//         //     console.log('after foo2');
//         // }

//         counter += 1;
//         console.log(counter);
//         if (counter >= 5) {
//             // console.log('after foo2');
//             clearInterval(intervalId);
//             // console.log('after foo2');
//         }
//     }, 1000);

//     console.log('after interval');
// }

// foo2();

// console.log('after foo2');

// before foo2
// before interval
// after interval
// after foo2
// 123

console.log('Начало работы приложения');

const hardCalculation = () => {
    let res = 0;
    for (let i = 0; i < 1000000000; i++) {
        res += i;
    }
    console.log(res);
    return res;
}

// вызов setTimeout без второго параметра (отработает нормально)
setTimeout(hardCalculation);

console.log('end');

