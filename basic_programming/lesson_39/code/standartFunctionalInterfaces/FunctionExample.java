package lesson_39.code.standartFunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> halfOfSqrt = x -> Math.sqrt(x) / 2;

        System.out.println(halfOfSqrt.apply(9));
    }
}
