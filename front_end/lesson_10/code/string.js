// цикл while

// let a = 0;
// while (a < 10) {

//     // пропустить одну итерацию цикла
//     if (a === 5) {
//         a++;
//         continue;
//     }

//     console.log(a);

//     a++;

//     // досрочный выход из цикла
//     // if (a === 5) {
//     //     break;
//     // }
// }

let str1 = 'hello world';
// длина строки
// console.log(str1.length);

// перебрать строку в цикле
// for (let i = 0; i < str1.length; i++) {
//     console.log(str1[i]);
// }

// получить первый символ строки
// let firstLetter = str1[0];
// console.log(firstLetter);

// let str2 = 'hello World';

// приведение строки к верхенему регистру
// const res = str2.toUpperCase();
// console.log(res);
// console.log(str2);

// приведение строки к нижнему регистру
// const res2 = str2.toLowerCase();
// console.log(res2);

// выбрать подстроку из строки
// const str3 = 'hello world';
// const res = str3.substring(0, 4);
// console.log(res);

// получить индекс подстроки в строке
// const str4 = 'hello world';
// const res = str4.indexOf('world')
// console.log(res);

// заполнить строку вначале значением x если длина строки меньше 10
// const str5 = '111';
// const res = str5.padStart(10,'x');
// console.log(res);

// разделить строку по указанному символу (в данном случае пробел)
// const str6 = 'hello world';
// const res = str6.split(' '); // [ 'hello', 'world' ]
// console.log(res);

const personName = 'Robert';
const age = 30;

// шаблоныне строки (вставка переменных в строку)  - используем обратыне кавычки
const message1 = `Сотурднику с именем ${personName} сейчас ${age} лет`;
// старый способ - конкатенация
const message2 = 'Сотруднику с именем ' + personName + ' сейчас ' + age + 'лет';
console.log(message1);

// перенос на новую строку
const str7 = `asdfasdfasdfaasdf asdfasdf
adfadsfasdfasdfasdfaasdf asdfasdf 
adfadsfasdfasdfasdfaasdf asdfasdf 
adfadsfasdfasdfasdfaasdf asdfasdf adfadsfasdfasdfasdfaasdf asdfasdf adfadsf`;

// старый способ для больших строк
const str8 = 'asdfasdfasdfaasdf asdfasdf'+
' adfadsfasdfasdfasdfaasdf asdfasdf adfadsfasdfasdfasdfaasdf asdfasdf adfadsfasdfasdfasdfaasdf asdfasdf adfadsfasdfasdfasdfaasdf asdfasdf adfadsf';

console.log(str8);
