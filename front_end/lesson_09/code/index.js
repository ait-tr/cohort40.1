




// -------------

// Передача по ссылке и по значению

let a = 4;
let b = a;
a = 10;

// let arr3 = [];  
// let arr4 = arr3;

// arr3.push(111)

// console.log(arr3);
// console.log(arr4);
// ----------------


const arr3 = [];   // asdfasdfasdf -> []
let arr4 = arr3; // adsfasfasdfasdfasdfasdf

arr4 = [111, 2222]

arr3.push(111);
arr4.push(222);

// console.log(arr3);
// console.log(arr4);

// -----------
let arr5 = [1, 2, 3];
let arr6 = arr5;
arr5 = [11, 22, 33];

//-----


let arr111 = [1, 2, 3, 4];

// добавить элемент в массив
// arr111.push(555);
// console.log(arr111);

// удалить последний элемент массива
arr111.pop();
// console.log(arr111);

const arr2 = [1, 2, 3, 4];

// console.log(arr2[0]);
// console.log(arr2[1]);

// arr2.pop(1, 333, 'haello');

// удалить первый элемент
// arr2.shift()

// вырезать кусок массива не изменяя исходный
// let res = arr2.slice(0, 2);


// console.log(arr2);
// console.log(res);

// удаление элементов по индексу
// const res = arr2.splice(1, 1);
// console.log('res:', res);
// console.log('arr2: ', arr2);

// arr2.splice(,);

// join() - превратить массив в строку
// const arr33 = [11,22,33,44];
// const res = arr33.join('|'); //11|22|33|44
// console.log(res);

// меняем элемент массива 2 на 222
const arr44 = [1, 2, 3, 4];
arr44[1] = 222;
// console.log(arr44);

// длина массива
let d = arr44.length;
// console.log(d);

// ---

// Set
// Map
// WeakMap
// WeakSet
// let t = {
//     name: 'bob',
//     age: 22,
// }

// ---

// let bb = 1;
// инкремент (увеличить на 1 переменную)
// bb++;
// bb+=1;
// bb = bb+1;
// console.log(bb);

// цикл фор
// for (let i = 0; i < 10; i++) {
//     console.log(i);
// }

// вывели все элементы массива
// const arr66 = [11, 22, 33, 44];

// for (let i = 0; i < arr66.length; i++) {
//     console.log(arr66[i]);
// }

// ключевое слово брей (остановить цикл)
// for (let i = 0; i < 10; i++) {
//     console.log(i);
//     if (i === 5) {
//         break;
//     }
// }

// пропустить одну итерацию цикла
// for (let i = 0; i < 10; i++) {
//     if (i === 5) {
//         continue;
//     }
//     console.log(i);
// }


// бескончный цикл
// for (let i = 0; true; i++) {
//     console.log(i);
// }

// выход из бесконечного цикла через break
// for (let i = 0; true; i++) {
//     console.log(i);

//     if (i > 100) {
//         break;
//     }
// }

// бескончный цикл
// for (; ;) {
//     console.log('hello');
// }











