package lesson_40.code.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<String> coll_str =
                Arrays.asList("10","20","1","10","50","25","20","25","10");

        List<Integer> coll_int = Arrays.asList(1,2,3,4,5);

        // find first
        System.out.println("Get find first element : " +
                coll_str.stream()
                        .findFirst()
                        .orElseGet(() ->"empty")
        );


        // collect

        System.out.println("Collect.toSet() result: " +
                coll_str.stream()
                        .collect(Collectors.toSet())
        );

        // count
        System.out.println("Count() result: " +
                coll_str.stream()
                        .count()
        );

        // равноценно coll_str.size() )))))

        // anyMath

        System.out.println("anyMatch() result: " +
                coll_str.stream()
                        .filter(x -> Integer.parseInt(x) > 10)
                        .anyMatch(x -> x.equals("10"))
                       );

        // allMatch
        System.out.println("anyMatch() result: " +
                coll_str.stream()
                        .allMatch(x -> x.equals("10"))
        );

        // min
        System.out.println("min() result: " +
                coll_str.stream()
                        .min((str1,str2) -> str1.compareTo(str2))
        );
        // max for String
        System.out.println("max() result: " +
                coll_str.stream()
                        .max((str1,str2) -> str1.compareTo(str2))
                        .orElse("empty")
        );

        // max for Integer
        System.out.println("max() result: " +
                coll_int.stream()
                        .max((x,y)-> x.compareTo(y))
                        .orElse(0));

        // forEach применит функцию ко всем элементам потока данных
        // но НЕ МОЖЕТ гарантировать порядок выполнения

        System.out.println("Result forEach()");
        coll_str.stream()
                .forEach(elem -> System.out.print(elem + ", "));

        System.out.println();

        // toArray

        String[] strArray = coll_str.stream()
                .toArray(size -> new String[size]);

        System.out.println(Arrays.toString(strArray));

        // reduce преобразует все элементы в один объект
        System.out.println("Result of string reduce: " +
                coll_str.stream()
                        .reduce((str1, str2) -> str1 + "; " + str2)
                        .orElse("empty")
        );


        System.out.println("Result of integer reduce: " +
                coll_int.stream()
                        .reduce((c1, c2) -> c1 + c2)
                        .orElse(0)
        );

    }
}
