

// пример стрелочных функций
const func1 = x => x > 2;
const func0 = (x, y) => {
    return x > y;
};

const res0 = func0(4, 5)
// console.log(res0);

// ----------------------------

const arr1 = [1, 2, 3, 4, 5];

// выбрать все элементы массива со значением больше 2
const res1 = arr1.filter(x => x > 2);
// console.log(res1); // [ 3, 4, 5 ]

// пример функции filter с обычной функцией
const arr2 = [1, 2, 3, 4, 5];
const res2 = arr2.filter(function (x) {
    return x > 2;
})

// console.log(res2); // [ 3, 4, 5 ]


const arr3 = [1, 2, 3, 4, 5];

// добавили дебаггре для изучения функции через отладку
const res3 = arr3.filter(item => {
    // debugger;
    return item > 2;
});

// console.log(res3);

// используем индекс для фильтрации 
const arr4 = [1, 2, 3, 4, 5];

const res4 = arr4.filter((item, i, arr) => {
    // debugger;
    if (i === 0) {
        return true;
    }
    return item > 2;
});

// console.log(res4);

// возвращает все значения массива т.к. стрелочная функция в нутри filter  - для всех элементов массива возвращает true
const res5 = arr4.filter(item => {
    return true;
});
// console.log(res5);

// если не один элемент массива не соответстует условию в стрелочной функции - то результат будет пустой массив
const arr6 = [1, 2, 3, 4, 5];
const res6 = arr6.filter(item => item > 100)
// console.log(res6); // []


// --------------------

const persons1 = [
    { name: 'bob1', age: 22 },
    { name: 'bob2', age: 11 },
    { name: 'bob2', age: 1 },
    { name: 'bob3', age: 44 },
    { name: 'bob4', age: 55 },
];

const personsRes1 = persons1.filter(pers => pers.age > 33);
// console.log(personsRes1);


// выбрать элементы из массива те у которых имя равно 'bob2' или те у которых возраст больше 33
const personRes2 = persons1.filter(pers => {
    if (pers.name === 'bob2') {
        return true;
    }

    return pers.age > 33;
});

// console.log('Результат фильтрации: ', personRes2);

// console.log('Исходный массив: ', persons1);

// --------------------

// функция find для массива - вернет первый элемент удовлетворяющий условию
const arr7 = [1, 2, 3, 4, 5];
const res7 = arr7.find(item => item > 2);
// console.log(res7);


// 
const persons2 = [
    { name: 'bob1', age: 22 },
    { name: 'bob2', age: 11 },
    { name: 'bob2', age: 1 },
    { name: 'bob3', age: 44 },
    { name: 'bob4', age: 55 },
]

// выбрать первый объект имя которого оканчивается на '2' например bob2
const resPersons2 = persons2.find(item => item.name[item.name.length - 1] === '2');
// console.log(resPersons2);

// ----------------

const arr8 = [1, 2, 3, 4, 5];
const res8 = arr8.map(item => item + 1);

const res9 = arr8.map(item => {
    return item + 1;
});
// console.log(arr8);
// console.log(res8);

const res10 = arr8.map((item, index, arr) => {
    return item + index;
})

// console.log(res10);

const arr9 = [1, 2, 3, 4, 5];
const res11 = arr9.map(item => item > 3);
// console.log(res11); // [ false, false, false, true, true ]


const arr10 = [
    { name: 'bob1', age: 22 },
    { name: 'bob2', age: 11 },
    { name: 'bob2', age: 1 },
    { name: 'bob3', age: 44 },
    { name: 'bob4', age: 55 },
];

// каждому элементу массива добавлии 2 новых свойства (использовали деструктуризацию)
const res12 = arr10.map(item => {
    return { ...item, salary: 1000000, test: item.name + item.age }
});

// console.log(res12);

// получить список age из массива объектов
const res13 = arr10.map(item => item.age);
// console.log(res13); // [ 22, 11, 1, 44, 55 ]

// forEch

// перебор массива с помощью forEach
const arr14 = [1, 2, 3, 4, 5];
// arr14.forEach(item => {
//     console.log(item);
// })

// операции break continue - не работают в этом цикле
const arr15 = [1, 2, 3, 4, 5];
arr15.forEach(item => {
    // 
    // if(item == 2){
    //     continue;
    //     break;
    // }
    // console.log(item);
})

// const test = arr15.forEach(item => {

//     if (item == 2) {
//         return item;
//     }
//     console.log(item);
// })

// console.log(test); // undefined

// ---------------------

const arr16 = [1, 2, 3, 4, 5];

// функция редьюс позволяет суммировать все элементы массива
const res14 = arr16.reduce((acc, current) => {
    acc += current;
    return acc;
}, 0);

console.log(res14);














