package lesson_28.code.lessoncode.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1,"Ruslan");
        myMap.put(2,"Oleg");
        myMap.put(3,"Roman");

        System.out.println(myMap);

        System.out.println(myMap.get(2));


        Map<String, Integer> map2 = new HashMap<>();

        map2.put("Ruslan", 30);
        map2.put("Oleg", 35);
        map2.put("Roman", 21);

        System.out.println(map2.get("Roman"));

        System.out.println(map2);

        map2.put("Roman",22);

        System.out.println(map2);

        Map<String, List<String>> library = new HashMap<>();

        library.put("Ruslan", new ArrayList<>());


    }
}
