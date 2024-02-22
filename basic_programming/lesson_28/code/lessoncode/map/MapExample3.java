package lesson_28.code.lessoncode.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {

        Map<Person, Dog> map = new HashMap<>();

        map.put(new Person("Ruslan", 30), new Dog("Tuzik", 2));
        map.put(new Person("Oleg", 35), new Dog("Bobik", 3));
        map.put(new Person("Roman", 21), new Dog("Palkan", 5));


        map.put(new Person("Ruslan", 30), new Dog("Tuzik2", 2));

        System.out.println(map);
    }
}
