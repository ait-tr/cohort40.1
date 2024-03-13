package lesson_41.code.streamPractice.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonMaxAgeDemo {
    /*
    найти сотрудника у кого самый большой возраст
     */

    public static void main(String[] args) {


        Person person1 = new Person("Petr", 28);
        Person person2 = new Person("Ruslan", 32);
        Person person3 = new Person("Victor", 29);
        Person person4 = new Person("Mike", 48);
        Person person5 = new Person("Vadim", 38);

        List<Person> users = Arrays.asList(person1, person2, person3, person4, person5);


        Person userWithMaxAge = users.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .findFirst()
                .orElse(null);

        System.out.println(userWithMaxAge);

        userWithMaxAge = users.stream()
                .reduce((p1,p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .get();

        System.out.println(userWithMaxAge);


        userWithMaxAge = users.stream()
                .reduce((p1, p2) -> Person.maxAge(p1,p2))
                .get();
        System.out.println(userWithMaxAge);
    }

}
