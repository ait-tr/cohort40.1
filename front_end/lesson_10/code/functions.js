// подем функции
// myFunc1();

// создание функции
// function myFunc1() {
//     console.log('hello func');
// }

// вызов функции
// myFunc1();

// создание анонимной функции
// const myFunc2 = function () {
//     console.log('hello anonim func');
// }

// myFunc2();

// создание стрелочной функции
// const myFunc3 = () => {
//     console.log('hello arrow func');
// }

// const myFunc4 = () => console.log('hello arrow func2');

// myFunc4();

//----------------------------------------------------

// функция с аргументом
function myFunc5(a) {
    console.log(a);
}

// myFunc5('hello');
// myFunc5(111);
// myFunc5([1, 2, 3]);

// функция с 2 аргументами
function sum(a, b) {
    console.log(a + b);
}

// sum(1, 2);
// sum('hello', 'world');

function calculate(a, b) {
    const res = a + b;
    return res;
}

// const result111 = calculate(1, 2);
// console.log(result111);

// функция с возвратом значения
function foo() {
    return 1;
}

const result2 = foo();
// console.log(result2);

// возврат разных значений из функций по условию
function myFunc6(a) {
    if (a > 6) {
        return '>6';
    } else {
        return '<6';
    }
}

// console.log(myFunc6(1));

function summa(a, b) {
    return a + b;
}

// вызов функции внутри другой функции
function main() {
    const res = summa(1, 2);
    console.log(res);
}

// main();

// создание функции внутри другой функции
function wrapperFunc1() {
    function innerFunc1() {
        console.log('inner func');
    }
    innerFunc1();
}

// wrapperFunc1();

// вложенные функции
function personCalculatorSalary() {
    function calculateSalery() {
        console.log('salary');
    }

    function calculateBonuses() {
        console.log('calculate bonuses');
    }

    calculateSalery();
}

// возвращаем функцию из другой функции
function wrapperFunc2() {
    function innerFunc1() {
        console.log('inner func');
    }

    return innerFunc1;
}

// const innf = wrapperFunc2();
// innf();

// запуск вложенной функции
// wrapperFunc2()();

// возвращаем функцию из другой функции
function wrapperFunc3() {
    function innerFunc1() {
        console.log('inner func1');
    }

    function innerFunc2() {
        console.log('inner func2');
    }

    return [innerFunc1, innerFunc2];
}

// wrapperFunc3()[1]();


// самовызывающаяся функция
// (function () {
//     console.log('self invoke function');
// })();

// ------------------

// Область видимости переменных подъем переменной если создали через var
function myFunc7() {
    console.log(a);

    var a = 10;
    console.log(a);
}

// визуально что происходит когда создаем переменные через
function myFunc7() {
    var a;
    var b;
    var lastName;

    console.log(a);

    a = 10;
    b = 22;
    lastName = 'Ivan';
    console.log(a);
}

// myFunc7();

function myFuction8() {
    // переменная счетчик объявлена через var в цикле
    for (var i = 0; i < 10; i++) {
        console.log(i);
    }

    // переменная счетчик (i) доступна вне цикла
    console.log('i: ', i);
}

// myFuction8();

function myFunc8() {
    let a = 10;

    for (let i = 0; i < 10; i++) {
        // console.log(i);
        console.log(a);

        // переменная объявленная во вложенном блоке не видна во внешнем блоке
        let b = 10;
    }

    // ошибка обращения к переменной т.к. она находится в другом блоке
    console.log(b);

}

// myFunc8();

// переменная вне функции
let age = 10;

function myFunc9() {
    let a = 10;

    for (let i = 0; i < 10; i++) {
        for (let j = 0; j < 10; j++) {
            console.log('i: ', i);
            console.log(a);
            // получаем доступ к переменной извне функции
            console.log('age: ', age);
        }
    }
}

// myFunc9();

// let lastName = 'Rober';

// приоритет видимости переменных (внутренняя переменная более приоритетан чем внешняя)
// function myFunc10() {
//     let lastName = 'Rober111';

//     for (let i = 0; i < 10; i++) { 
//         let lastName = 'Rober222';
//         console.log(lastName);
//     }

//     console.log(lastName);
// }

let lastName11 = 'Rober';

function myFunc11() {
    let lastName11 = 'Rober111';

    for(let i = 0; i < 10; i++){
        // переписываем переменную lastName11 = 'Rober111'; которая в первом внешнем блоке  (фигурные скобки)
        lastName11 = 'Rober222';
    }

    console.log(lastName11);
}

myFunc11();

console.log(lastName11);



