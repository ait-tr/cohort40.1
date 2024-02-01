package lesson_13.code.lessoncode.arrayDemo;

import lesson_06.code.lessoncode.scanner.UserInput;

public class CatDemoOldSchool {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Lucky");
        Cat cat3 = new Cat("Happy");


        /*
        предполложим мы хотим у каждого объекта типа Cat распечать его имя

         */
        System.out.println("У нас живут:");
        System.out.println("Имя кота: " + cat1.getName());
        System.out.println("Имя кота: " + cat2.getName());
        System.out.println("Имя кота: " + cat3.getName());

// а что делать если таких объектов у нас много???

        UserInput userInput = new UserInput();

        int catNumber = userInput.inputInteger("Выберете какого кота нам нужно найти? (от 1 до 3)");

        switch (catNumber){
            case 1:
                System.out.println("Вы выбрали кота: " + cat1.getName());
                break;
            case 2:
                System.out.println("Вы выбрали кота: " + cat2.getName());
                break;
            case 3:
                System.out.println("Вы выбрали кота: " + cat3.getName());
                break;
            default:
                System.out.println("Такого кота у нас нет" );
        }
    }
}
