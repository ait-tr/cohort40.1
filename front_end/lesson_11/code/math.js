const a = 2;

// возведение в степень 3 числа а
// const res = Math.pow(a, 3);
// console.log(res);

// округление к минимому
// const res2 = Math.floor(10.7);
// console.log(res2);



// приведение строки к числу - если строка не являестя числом - то вернет NaN (не число)
const testRes = parseInt('asdfasdf');
// console.log(typeof testRes);
// console.log(testRes);

// если к NaN прибавить любое число - то все равно будет NaN
const testResSum = testRes + 1
// console.log(testResSum);

// -----------

// найти максимум из списка аргументов
const res3 = Math.max(1, 10, 6);
// console.log(res3);

// Math.max - не работает с массивом - возвращает NaN
// const arr = [1, 10, 6];
// const res4 = Math.max(arr);
// console.log(res4);

const arr1 = [1, 10, 6, 7];
const res4 = Math.max(...arr1);

// визуально - тоже самое что и const res4 = Math.max(...arr1);
// const res5 = Math.max(1, 10, 6, 7);
const res6 = Math.min(...arr1);
// console.log(res4);
// console.log(res6);

// пи
console.log(Math.PI)



