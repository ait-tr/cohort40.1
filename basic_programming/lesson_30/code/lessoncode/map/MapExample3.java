package lesson_30.code.lessoncode.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<String, List<String>> stringListMap = new HashMap<>();

        stringListMap.put("color", Arrays.asList("red", "green", "blue"));
        stringListMap.put("fruits",Arrays.asList("orange", "banana", "kiwi"));


        // пройдемся по коллекции и посмотрим все записи

        for (Map.Entry<String, List<String>> entry : stringListMap.entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();

           // var1:  System.out.println("ключ: " + key + ", значения: " + values);

            System.out.println("ключ: " + key);
            for (int i = 0; i < values.size(); i++) {
                System.out.println(" значение из списка № " + i + " : " + values.get(i));
            }
        }
    }
}
