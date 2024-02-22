package lesson_28.code.lessoncode.practice;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {
        int[] arr = {1,7,49,4,12,9,45,3,9,23,1,7,12,1,7,23};

          /*
        написать метод, который получает на входе массив
        возвращает коллекцию, у которой
        в качестве ключа - элемент массива,
        а значение - количество повторений
         */

        Map<Integer, Integer> myMap = createHashMapCollection(arr);

        System.out.println(myMap);
    }

    static Map<Integer, Integer> createHashMapCollection(int[] arr){

        // метод возвращает коллекцию Map, которая в качестве
        // ключа использует значение из массива
        // а в качестве значения будет хранить количество повторений этого ключа
        //   int[] arr = {1,7,49,4,12,9,45,3,9,23,1,7,12,1,7,23};

        Map<Integer,Integer> ourMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int key = arr[i];

            if (ourMap.get(key) != null) {
                count = ourMap.get(key);
            }

            count++;

            ourMap.put(key, count);
        }

        return ourMap;
    }
}
