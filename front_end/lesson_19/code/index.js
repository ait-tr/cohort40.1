// альтернативный способ создания класса
const Pers = class {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

const p0 = new Pers('bob0', 11);
// console.log(p0);


// описание класса Person
class Person {

    // поле класса вне конструктора
    lastName = 'unknown';

    #secret = 'secret word';

    // конструктор класса
    constructor(name, age, lastName, patronomic, salary = 0, secret = 'xxx') {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this._salary = salary;
        this.#secret = secret;
    }

    // метод класса
    introduce() {
        console.log(` Меня зовут: ${this.name}, мне ${this.age} лет`);
    }

    // метод класса с аргументом
    sayHello(personName) {
        console.log(`Привет ${personName}`);
    }

    // статический метод класса
    static showInfo() {
        console.log('Это класс для создания Person');
    }

    // геттер и сеттер через синтаксис  js ключевые слова  set   ,   get
    set salary(value) {
        // if (value > 100000000000000) {
        //     // console.log('Неверное значение зарплаты (слшком большая)');
        //     // return;

        //     throw new Error('Неверное значение зарплаты (слшком большая)');
        // }

        // if(this._salary === 0){
        //     throw new Error('xxxxxx');
        // }

        this._salary = value;
    }

    get salary() {
        return this._salary;
    }

    // гетте и сеттер через функции (самописные)
    getSalary() {
        return this._salary;
    }
    setSalary(value, typpSalry) {
        this._salary = value;
    }

    set secret(value) {
        this.#secret = value;
    }
    get secret() {
        return this.#secret
    }

    calculateInfo() {
        const res = this.#calculateSecretInof();
        console.log(res);
    }

    // приватный метод
    #calculateSecretInof() {
        return '1111';
    }
}

const p1 = new Person('bob', 22, 'yyy1');
// console.log(p1); // Person { name: 'bob', age: 22 }
// p1.introduce();
// p1.sayHello('Ivban');

const p2 = new Person('bob2', 33, 'yyy2', 1000000);
// p2.introduce();

// console.log(p2.lastName);
p2.lastName = 'zzzz';

// вызов статического метода
// Person.showInfo();


p2.salary = 100000000000000000000000;
p2.setSalary(3000);

// console.log(p2.salary);
// console.log(p2.getSalary());

// console.log(p2);

// ошибка при обращении к приватному свойству
// p2.#secret

// console.log('secret: ', p2.secret);

// вызов метода который внутри себя вызывает приватный метод
p2.calculateInfo();




