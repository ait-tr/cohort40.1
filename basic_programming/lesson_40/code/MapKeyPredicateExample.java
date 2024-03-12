package lesson_40.code;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapKeyPredicateExample {

    public static void main(String[] args) {
        Map<Predicate<Integer>, String> response = new HashMap<>();

        Predicate<Integer> key = v -> v >= 100 && v < 200;

        response.put(key, "запрос получен 1");
        response.put(key, "запрос получен 2");

        System.out.println(response);

        System.out.println("==============");

        response.put(v -> v >=100 && v < 200, "Запрос получен");
        response.put(v -> v >=200 && v < 300, "Ok");
        response.put(v -> v >=300 && v < 400, "Сервисный запрос");
        response.put(v -> v >=400 && v < 500, "Ошибка пользователя");
        response.put(v -> v >=500 && v <= 550, "Ошибка сервера");

        System.out.println(response);

//        boolean keyExistsWithNewLambda = response.containsKey(key);
//
//        System.out.println(keyExistsWithNewLambda);

        System.out.println(checkMap(response, 120));
        System.out.println(checkMap(response, 220));
        System.out.println(checkMap(response, 320));
        System.out.println(checkMap(response, 420));
        System.out.println(checkMap(response, 520));
        System.out.println(checkMap(response, 620));


        System.out.println();
    }

    public static String checkMap(Map<Predicate<Integer>, String> response, int value){
        for (Map.Entry<Predicate<Integer>, String> entry : response.entrySet()){
            if (entry.getKey().test(value)){
                return entry.getValue();
            }
        }

        return "Значение не входит в диапазон";
    }
}
