package lesson_13.code.lessoncode.arrayDemo;

import lesson_06.code.lessoncode.scanner.UserInput;

public class CatDemoWithArray {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Lucky");
        Cat cat3 = new Cat("Happy");

// предположим что КТО-ТО создал где-то этих котов, а нам передал для работы только массив

        Cat[] cats = {cat1, cat2,cat3};

        /*
        предполложим мы хотим у каждого объекта типа Cat распечать его имя

         */
        System.out.println("У нас живут:");
        System.out.println("Имя кота: " + cats[0].getName());
        System.out.println("Имя кота: " + cats[1].getName());
        System.out.println("Имя кота: " + cats[2].getName());

// а что делать если таких объектов у нас много???

        System.out.println(cats.length);




    }
}
