package lesson_28.code.lessoncode.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, Dog> map = new HashMap<>();

        map.put(1, new Dog("Tuzik", 2));
        map.put(2, new Dog("Bobik", 3));
        map.put(3, new Dog("Palkan", 5));

        System.out.println(map);

        Dog dogFromCollection = map.get(2);

        System.out.println(dogFromCollection);

        map.put(10, dogFromCollection);

        System.out.println(map);

    }
}
