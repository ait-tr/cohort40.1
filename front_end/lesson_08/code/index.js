// вывод в консоль информации
// console.log("hello world 333")

// создание переменной
let s = 'hello';
s = 1;

// создание константы
const myConst = 111;
// myConst = 2;

// создание переменной через var ( так делать не нужно )
var myVariable = 333;

// console.log(myConst);

// переменная числового типа
let a = 1;

// переменная строкового типа
let b = 'hello';

// переменная булевого типа
let c = true;

// копирование по значению
let first = 1;
let second = first;

first = 2;

// console.log(first);
// console.log(second);

// пустое значение (null)
let a1 = null;

// console.log(a1);

// переменная со значением undefined ( не определено )
let a2;
// console.log(a2);

// псевдокод ветвления
// if(истина){
//     // сделай это
// }else{
//     // сделай другое
// }

// let a3 = '10';
// '10' == 10
// сравнение с приведением типа
// if (a3 == 10) {
//     console.log('a3 = 10');
// } else {
//     console.log('не равно');
// }

// ------------
// let a3 = '10';

// if (a3 === 10) {
//     console.log('a3 = 10');
// } else {
//     console.log('не равно');
// }

let a4 = 1;
let a5 = 2;
// console.log(a4 + a5);

let res = a4 + a5;
// console.log(res);

let res2 = 'hello' + 5;
// console.log(res2);

// сложение строки и числа (конкатенация строк)
let aa = '2';
let bb = 3;
let res3 = aa + bb;
console.log(res3);

// ------------------

// оператор switch case
let day = 'monday';
switch (day) {
    case 'monday':
        console.log('понедельник');
        break;
    case 'tuesday':
        console.log('вторинк');
        break;
    default:
        console.log('неизвестный день недели');
        break;
}

// оператор ветвление (тоже самое что и switch case - выше )
if (day === 'monday') {
    console.log('понедельник');
} else if (day === 'tuesday') {
    console.log('вторинк');
} else {
    console.log('неизвестный день недели');
}




