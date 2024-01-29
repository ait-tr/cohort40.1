package lesson_10.code.lessoncode.settersAndGetters;


import java.util.Objects;
import java.util.Scanner;

public class PersonDemo2 {
    public static void main(String[] args) {

        PersonCreate create = new PersonCreate();

      //  Person person1 = create.createPersonWith3Parameters();

        Person person2 = create.createPersonWith2Parameters();

       // System.out.println(person1);
        System.out.println(person2);

        person2.setAddress(create.inputNewAddress());
        System.out.println(person2);

        boolean isJamesBond = false;

        // если адрес в переменной person2 эквивалентен по значению "Skyfall"
        if (person2.getAddress().equals("Skyfall")) {
            isJamesBond = true;
            System.out.println("Это James Bond!" );
        }

        System.out.println(isJamesBond);


        System.out.println("personName: " + person2.getName());
        System.out.println("personAddress: " + person2.getAddress());
        System.out.println("personCode: " + person2.getPersonalCode());

        System.out.println("-------------------------");


    }
}
