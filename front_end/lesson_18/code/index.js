'use strict'

const ob1 = {}

// --------------

// функция конструктор
function Person() { }

// создание объекта с помощью функции конструктор
const person1 = new Person();
// console.log(person1);

// -----------------
// функция конструктор с параметрами
function Person2(name, age) {
    this.personName = name;
    this.age = age;
}

// визуально что делает функция конструктор
// function Person2(name, age) {
//     const this = {}
//     this.personName = name;
//     this.age = age;
//      // неявно возвращает this
//     return this;
// }

// создали два объекта через функцию конструктор с параметрами
const p1 = new Person2('bob', 22);
const p2 = new Person2('bob2', 33);

// console.log(p1);
// console.log(p2);

// -----------------------


// создаение объекта с методом
const p4 = {
    personName: 'bob',
    age: 22,
    introduce() {
        // console.log('hello2');
    }
}

// p4.introduce();


function Person2(name, age, lastName) {
    // console.log('create');
    this.personName = name;
    this.age = age;
    this.fullname = name + ' ' + lastName;
    // this.introduce = function () {
    //     console.log('hello');
    // }
}

function introduce(text) {
    // console.log(`hello ${text}`);
}

Person2.prototype.introduceXXX = introduce;

const p3 = new Person2('bob', 22, 'ln');
// p3.introduceXXX('everybody');

const p5 = new Person2('bob2', 22, 'ivanov');
const p6 = new Person2('bob3', 33, 'petrov');

// проверяем, что методы у каждого объекта свои
// console.log(p5.introduceXXX === p6.introduceXXX);

// p5.introduceXXX();

// ---------------

function Doctor(salary) {
    this.salary = salary;
}

const person = {
    personName: 'bob',
    age: 22
}

// все объекты созданные через функцию конструктор Doctor - в качестве прототипа будут иметь объект  person
Doctor.prototype = person;

const d1 = new Doctor(2000);
const d2 = new Doctor(3000);

// ------------------

function Doctor2(salary, name) {
    this.salary = salary;
    this.personName = name;
}

// прототип для Doctor2
const person2 = {
    personName: 'bob', // это поле совпадает с  полем в функции конструтор объекта
    age: 22
}

// все объекты созданные через функцию конструктор Doctor - в качестве прототипа будут иметь объект  person
Doctor.prototype = person;

const d3 = new Doctor2(2000, 'bob2222');
// console.log(d3.personName); // выведется значение из самого объекта а не из прототипа

// console.log(d3.__proto__);

// -----------------

const manky = {
    age: 10
}

const pers = {
    name: 'bob'
}

// установка прототипа через скрытое свойстов __proto__
pers.__proto__ = manky;

// debugger;
// console.log(pers);

// ---------------

const manky2 = {
    age: 10
}

const pers2 = {
    name: 'bob'
}

Object.setPrototypeOf(pers2, manky2);

// debugger;
// console.log(pers2);
// console.log(Object.getPrototypeOf(pers2));

// ---------------

const ob2 = {
    name: 'bob'
}

const ob3 = {
    age: 22,
}

// в объект ob2 положить свойства из ob3
Object.assign(ob2, ob3);

// создали пустой объект и положили в него все свойства из объекта ob3
const res = Object.assign({}, ob3);

const obRes = {
    ...ob2,
    ...ob3
}

// console.log(res);

const obBase = { name: 22 }

const res2 = Object.create(obBase);

// const foo = () => { console.log('test'); }

// const res3 = Object.create({ name: 'bob2', foo });

// console.log(res3);

// --------------

const ob4 = {
    name: 'bob'
}

Object.setPrototypeOf(ob4, { age: 33 });

// проверяем что свойсов принадлежит объекту или прототипу
const res4 = ob4.hasOwnProperty('name')
const res5 = ob4.hasOwnProperty('age')
// console.log(res4);
// console.log(res5);

// -----------------------

const person3 = {
    name: 'bob',
    introduce(text = '') {
        return `Меня зовут ${this.name} ${text}`;
    }
}

const perosn4 = {
    name: 'bob2',
}

// функцию из person3 передали в объект person4 (одолжили фукнцию)
perosn4.intro = person3.introduce;

// console.log(perosn4.intro());

person3.introduce();

// потеряли контекст (передали ссылку на фнукцию без объекта)
const foo = person3.introduce;
// console.log(foo());


const res6 = foo.call(perosn4, 'доп текст');
// const res7 = perosn4.foo('доп текст');
// console.log(res6);

// -------------------

const introduce1 = function (text = '', text2 = '') {
    return `${this.name} ${text} ${text2}`;
}

const ob5 = {
    name: 'bob'
}

const res8 = introduce1.call(ob5, 'dop text', ' dop_text2');
// вызов функции через apply  (управление контекстом вызова функции)
const res9 = introduce1.apply(ob5, ['dop111', 'dop222']);

// использование bind для управления контекстом
const bindedIntro = introduce1.bind(ob5, 'bind1', 'bind2');
const res10 = bindedIntro('xx');

console.log(res10);






