package lesson_39.code.standartFunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExamples {
    public static void main(String[] args) {
        // ======== PREDICATE ===========

        // "старая полная" форма записи

        Predicate<Integer> isPositiveFullText = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 0) {
                    return true;
                }
                return false;
            }
        };

        Predicate<Integer> isPositive = x -> x >= 0;

        System.out.println(" -5 > 0 ? - " + isPositive.test(-5));


        // ======== Consumer ===========

        Consumer<Integer> printer = x -> {
            System.out.println("This is amount in EUR: ");
            System.out.printf("%d EUR \n", x);
        };

        printer.accept(600);


        // ======== Function ===========

        Function<Integer, String> integerToTextConverter = x -> String.valueOf(x) + " EURO";

        System.out.println(integerToTextConverter.apply(750));

    }
}
