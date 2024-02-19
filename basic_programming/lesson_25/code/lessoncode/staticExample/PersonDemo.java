package lesson_25.code.lessoncode.staticExample;

import java.util.Arrays;

public class PersonDemo {
    public static void main(String[] args) {

        Person personPetr = new Person();
        Person personOlga =new Person();

        personPetr.name = "Petr";
        personPetr.town = "Berlin";

        System.out.println("======= PETR ========");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        personOlga.name = "Olga";
        personOlga.town = "Leipzig";

        System.out.println("======= OLGA ========");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("======= PETR ========");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);



//        PersonArray personArray = new PersonArray();
        Person[] people = PersonArray.createArray();

        System.out.println(Arrays.toString(people));

    }
}
