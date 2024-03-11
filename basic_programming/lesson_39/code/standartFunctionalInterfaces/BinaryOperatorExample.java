package lesson_39.code.standartFunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Double> div = (x,y) -> x / y;

        System.out.println(div.apply(5.4,2.0));
    }
}
