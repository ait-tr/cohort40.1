const person = {
    name: 'bob',
    age: 22
}

// const name = person.name;
// const age = person.age;

// деструктуризация объекта
// const { xxx = 'test', name, age } = person;

// console.log(name);
// console.log(age);
// console.log(xxx);

// деструктуризация в аргументах функции
// const foo = ({ firstArg, secondArg }) => {
//     console.log(`аргумент1: ${firstArg} аргумент2: ${secondArg}`);
// }

// foo({ firstArg: 'xxx', secondArg: 'yyy' });

// const person2 = {
//     name: 'bob',
//     age: 22,
//     car: {
//         carName: 'BMW',
//         speed: 300
//     }
// }

// // const carName = person2.car.carName;

// // деструктуризация вложенных объектов
// const { name, age, car: { carName, speed } } = person2;

// console.log(carName);

// const person2 = {
//     name: 'bob',
//     age: 22,
//     car: {
//         carName: 'BMW',
//         speed: 300
//     }
// }

// // деструктуризация вложенных объектов вариант 2
// const { car } = person2;
// console.log(car);

// const person2 = {
//     name: 'bob',
//     age: 22,
// }


// const name = 'test';

// // переименование переменной при деструктуризации
// const { name: pName } = person2;
// console.log(pName);

// const person2 = {
//     // name: 'bob',
//     age: 22,
// }


// const name = 'test';

// // переименование переменной и задание значения по умолчанию
// const { name: pName = 'newName' } = person2;
// console.log(pName);

// const person2 = {
//     name: 'bob',
//     age: 22,
//     salary: 3000,
//     lastName: 'ivanov',
// }

// const { name, ...rest } = person2;

// console.log(name);
// console.log(rest);

// const person2 = {
//     name: 'bob',
//     age: 22,
// }

// const person3 = {
//     salary: 3000,
//     lastName: 'ivanov',
// }

// // создали объект на основе свойств двух других объектов способ 1
// const ob1 = Object.assign({}, person2, person3);

// // создали объект на основе свойств двух других объектов способ 2 через рест оператор
// const ob2 = {
//     ...person2,
//     ...person3,
//     test: 'test'
// }

// console.log(ob2);


// деструктуризация массивов
// const arr = [1, 2];

// const [ first111, second111 ] = arr;

// console.log(first111);

// const arr = [1, 2, 3, 4];

// const [first111, ...rest] = arr;

// console.log(first111);
// console.log(rest);


// const arr = [];

// // значение при деструктуризации
// const [first111 = 10, ...rest] = arr;

// console.log(first111);
// console.log(rest);

// --------------------

// const name = 'bob';
// const age = 20;

// const pers = {
//     name,
//     age
// }

// console.log(pers);

// const persCreator = ({ name, age }) => {
//     const newPers = {
//         name,
//         age
//     }
//     return newPers;
// }

// const name = 'bob';
// const age = 55;

// const test = persCreator({ name, age });
// console.log(test);

// значения по умолчанию функций
// const foo = (a = 0, b = 0) => {
//     console.log(a + b);
// }

// foo();

// const foo = (...arg111) => {
//     console.log(arg111[0]);
//     console.log(arg111);
// }

// foo(1, 2, 3, 4, 5);


