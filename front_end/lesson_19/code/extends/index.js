
class Monkey {
    constructor(age) {
        this.age = age;
    }

    sayHello() {
        console.log('hello monkey');
    }
}

// класс Person наследуется от Monkey
class Person extends Monkey {
    constructor(name, age) {
        // вызов родительского конструктора
        super(age);
        this.name = name;

        // console.log('person constructor');
    }

    // переопределение методов в js (в классе monkey есть метод с таким же именем - если в дочернем тоже есть такой метод - то вызовется дочерний)
    sayHello(){
        super.sayHello();
        console.log('hello person');
    }
}

const p = new Person('bob', 111);
// console.log(p);
p.sayHello();