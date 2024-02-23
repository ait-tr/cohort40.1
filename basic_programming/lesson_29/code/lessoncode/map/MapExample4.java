package lesson_29.code.lessoncode.map;

import java.util.*;

public class MapExample4 {
    public static void main(String[] args) {
        Map<String, List<Cat>> stringCatMap = new HashMap<>();

        Cat cat1 = new Cat("Barsik", "gray");
        Cat cat2 = new Cat("Murzik", "white");

        List<Cat> grayCats = new ArrayList<>();
        grayCats.add(cat1);

        List<Cat> whiteCats = new ArrayList<>();
        whiteCats.add(cat2);

        stringCatMap.put("gray_cats", grayCats);
        stringCatMap.put("white_cats", whiteCats);


        for (String key : stringCatMap.keySet()){
            List<Cat> currentKeyCats = stringCatMap.get(key);

            // var1 : System.out.println("ключ: " + key + ", значения: " + currentKeyCats);

            System.out.println("Цвет кошек : " + key);
            for (int i = 0; i < currentKeyCats.size(); i++) {
                System.out.println("Cat name: " + currentKeyCats.get(i).getName());
            }
        }

    }
}
