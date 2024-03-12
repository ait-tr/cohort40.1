package lesson_40.code.streamExample;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("a1","a2","a3","a4","a10");

        String first = collection.stream()
                .findFirst()
                .orElse("Test1");

        System.out.println("First element: " + first);

        String last = collection.stream()
                .skip(collection.size() - 1)
                .findAny()
                .orElse("Test2");

        System.out.println("Last element: " + last);


        String a3element = collection.stream()
                .filter(str -> str.equals("a3"))
                .findFirst()
                .get();

        System.out.println("a3 element = " + a3element);

        System.out.println(collection.stream().skip(3).findFirst().get());

    }
}
