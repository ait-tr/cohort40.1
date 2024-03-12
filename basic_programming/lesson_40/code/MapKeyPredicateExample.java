package lesson_40.code;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapKeyPredicateExample {

    public static void main(String[] args) {
        Map<Predicate<Integer>, String> response = new HashMap<>();

        Predicate<Integer> key = v -> v >= 100 && v < 200;



        response.put(key, "запрос получен 1");
        response.put(key, "запрос получен 2");

        System.out.println(response);

        boolean keyExistsWithNewLambda = response.containsKey(key);

        System.out.println(keyExistsWithNewLambda);
    }
}
