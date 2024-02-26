package lesson_30.code.lessoncode.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample5 {
    public static void main(String[] args) {
        Map<List<String>, List<Cat>> listMap = new HashMap<>();

        Cat cat1 = new Cat("Barsik", "gray");
        Cat cat2 = new Cat("Murzik", "white");

        List<String> strings1 = Arrays.asList("wiskas", "milk");
        List<String> strings2 = Arrays.asList("fish", "meat");



        listMap.put(strings1, Arrays.asList(cat1));
        listMap.put(strings2, Arrays.asList(cat2));

        for (Map.Entry<List<String>, List<Cat>> entry : listMap.entrySet()){
            List<String> keyList = entry.getKey();
            List<Cat> catList = entry.getValue();

            System.out.println("ключи: " + keyList + " , значения: " + catList);
        }

    }
}
