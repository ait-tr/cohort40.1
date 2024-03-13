package lesson_41.code.streamPractice.task1;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        String[][] array = new String[][] {
                {"Hello", "world"},
                {"Hello", "Java"},
                {"Hello", "student"},
                {"Welcome", "to","Java"}
        };

        List<String> streamArray = Arrays.stream(array)
                .flatMap(innerArray -> Arrays.stream(innerArray))
                .distinct()
                .sorted()
                .toList();

        System.out.println(streamArray);

        long count = Arrays.stream(array)
                .flatMap(Arrays::stream)
                .count();

        long countUniq = Arrays.stream(array)
                .flatMap(Arrays::stream)
                .distinct()
                .count();




    }
}
