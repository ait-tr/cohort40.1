package lesson_29.code.lessoncode.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "One");

        Map<String, Person> personMap = new HashMap<>();

        Map<Person, String> map2 = new HashMap<>();

        Person person1 = new Person("James");

        map2.put(person1,"007");

        person1.setName("Bill");

        System.out.println(map2.get(person1));


    }
}
