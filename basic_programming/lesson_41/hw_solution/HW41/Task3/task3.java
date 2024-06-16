package code.HW41.Task3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        String result = strings.stream()
                .collect(Collectors.joining(" "));

        System.out.println(result);    }
}
