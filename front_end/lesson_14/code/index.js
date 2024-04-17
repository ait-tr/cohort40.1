

// создание объекта через литерал
const ob1 = {
    name: 'bob',
    age: 22,
    hello: 'hello world',
    test: 1111,
}

// внутрь дива положили значение из объета
const div = document.getElementById('xx')
div.innerText = ob1.age;


ob1.salary = 20000000;

// console.log(ob1);


// создание объекта через класс Object
const ob2 = new Object();
ob2.name = 'bob';
ob2.age = 22;
ob2.hello = 'hello world';
ob2.test = 'xxx';

// console.log(ob2);


const ob3 = {
    name: 'bob111',
    age: 22,
}

// получение переменной name из объекта ob3
const personName = ob3.name;
// console.log(personName);

const ob4 = {
    lastName: 'smith',
    // задали нестандартное имя переменной
    'person-name': 'bob'
}


// ob4.lastName = 'xxx';
// доступ к переменной с нестандартынм именем - через квадратные скобки и кавычки
ob4['person-name'] = 'bob222';

// console.log(ob4);

// -------------------------------------------------------

// удаление ключа
const ob5 = {
    lastName: 'smith',
    age: 22
}

// удаление через ключевое слово delete
delete ob5.lastName;

// console.log(ob5);

// const foo = (ob)=>{
//     console.log(ob);
// }

// foo(ob5)

const ob6 = {
    lastName: 'smith',
    age: 22
}

// заморозить объект от изменений
Object.freeze(ob6);


ob6.lastName = 'test';
// console.log(ob6);

const ob7 = {
    lastName: 'smith',
    age: 22
}

// если хотим удалить ключ - то нужно 10 раз подумать и может быть лучше установить значение в null
ob7.age = null;
// console.log(ob7);

// --------------------------

const ob8 = {
    lastName: 'smith',
    age: 22
}

const kkk = 'lastName';
// ob8.lastName
//получение значения объекта через квадратные скобки и переменную
const res1 = ob8[kkk];
// console.log(res1);

// получить все ключи объекта в виде массива
const keys = Object.keys(ob8); // [ 'lastName', 'age' ]
// console.log(keys);

// цикл for of - перебирает сразу значения
for (let k of keys) {
    // console.log(k);

    // получаем значения объекта через ключи в цикле
    const val = ob8[k];
    // console.log(val);
}


// получить все значения объекта в виде массива
const values = Object.values(ob8);
// console.log(values); // [ 'smith', 22 ]

// получить массив массивов - ключ значение
const entries1 = Object.entries(ob8);
// console.log(entries1);

// обращение к первому вложенному массиву к первому элементу
const res = entries1[0][0];
// console.log(res);


// --------------------------

// свойсвом объекта является массив
const ob9 = {
    lastName: 'sidorov',
    documents: [
        'passport', 'id', 'ensurance'
    ]
}


// console.log(ob9.documents);

// в цикле проходим по ob9.documents
// for (let i = 0; i < ob9.documents.length; i++) {
//     console.log(ob9.documents[i]);
// }

// свойства (ключи) объекта в виде других объектов
const ob10 = {
    lastName: 'sidorov',
    car: {
        carName: 'BMW',
        speed: 300,
        carburator: {
            manufacturer: 'china'
        }
    },
    documents: [
        'passport', 'id', 'ensurance'
    ]
}

const carb = ob10.car.carburator.manufacturer;
// console.log(carb);

const ob11 = { lastName: 'ivanov1', age: 22 }
const ob12 = { lastName: 'ivanov2', age: 22 }
const ob13 = { lastName: 'ivanov3', age: 22 }

// массив с объектами
const arr1 = [ob11, ob12, ob13];
// console.log(arr1);

//-------

const person = {
    lastName: 'ivanov',
    cars: [
        { carName: 'bmw' },
        { carName: 'subaru' },
        { carName: 'porshe' },
    ],
    // frends: [ob11, ob12, ob13]
    frends: arr1
}

// console.log(person);

// -------

const ob14 = {
    lastName: 'ivanov',
    age: 33
}

// оператор in - проверят наличие ключа в объекте, возвращает либо true либо false
const test = 'lastName' in ob14; // true
// console.log(test); 

// цикл который перебирает ключи  ( for in )
for (let k in ob14) {
    // console.log(k);
}

// -----------------

// рассчитываем значение свойства объекта
const ob15 = {
    test: 1 + 2, // 3
}

// console.log(ob15);

const a = 10;
const b = 5;
// рассчитываем поле объекта из переменных
const ob16 = {
    res: a + b,
}

// console.log(ob16);

const func1 = (a, b) => {
    return a + b;
}

// рассчитываем значение объекта вызовом функции
const ob17 = {
    res: func1(1, 2)
}

// console.log(ob17);


const 