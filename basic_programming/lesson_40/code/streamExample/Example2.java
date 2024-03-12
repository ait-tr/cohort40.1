package lesson_40.code.streamExample;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "BigMac", "Big Ben", "Ben");

        System.out.println(list.stream().filter(s -> s.contains("Big")).count());

        List<String> list2 = Arrays.asList("a1", "b5", "a2", "b4", "c1", "a1", "b5");

        System.out.println(list2.stream().min((str1, str2) -> str1.compareTo(str2)).get());

        List<String> result3 = list2.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println(result3);

        List<String> result4 = list2.stream()
                .sorted((o1,o2) -> o2.compareTo(o1))
                // .sorted((o1,o2) -> (-1) * o1.compareTo(o2))
                // .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();

        System.out.println(result4);
    }
}
