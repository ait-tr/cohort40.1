package lesson_40.code.streamAPI;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("10","20","1","10","50","25","20","25","10");

        System.out.println(strings);
        // filter & count

        long result = strings.stream()
                .filter(str -> str.equals("10"))
                .count();

        System.out.println("Result of filtering and counting: " + result);

        // sorted

        List<String> sortedString = strings.stream()
                //.sorted((str1,str2)-> (str2.compareTo(str1)))
                .sorted()
                .toList();

        System.out.println("Result of sorting: " + sortedString);

        // sorted and filtering and limit

        List<String> result3 = strings.stream()
                .sorted()
                .filter(str -> Integer.parseInt(str) > 10)
                .limit(3)
                .toList();

        System.out.println("Result of sorting, filtering and limit : " + result3);


        // sorted and filtering and skip

        List<String> result4 = strings.stream()
                .sorted()
                .filter(str -> Integer.parseInt(str) > 10)
                .skip(3)
                .toList();

        System.out.println("Result of sorting, filtering and skip : " + result4);

        // distinct

        List<String> result5 = strings.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println("Result of sorting, distinct : " + result5);

        // peek

        System.out.println("Result of peek() method:");
        List<String> result6 = strings.stream()
                .peek(element -> System.out.println(element + " hello!"))
                .toList();

        System.out.println(result6);


        //map

        System.out.println("Result of map() method:");
        List<Integer> result7 = strings.stream()
                .sorted()
                .map(x -> Integer.parseInt(x) * 25)
                .toList();

        System.out.println(result7);
    }
}
