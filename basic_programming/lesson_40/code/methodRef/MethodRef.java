package lesson_40.code.methodRef;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three");

        strings.forEach(s -> System.out.print(s + ", "));

        System.out.println();
        strings.forEach(System.out::print);
    }
}
