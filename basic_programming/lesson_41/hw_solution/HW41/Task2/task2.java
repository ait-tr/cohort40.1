package code.HW41.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "lemon", "car");

        List<String> oddLengthStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddLengthStrings);
    }
}
