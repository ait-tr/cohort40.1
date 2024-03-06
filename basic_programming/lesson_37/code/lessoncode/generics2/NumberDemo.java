package lesson_37.code.lessoncode.generics2;

import lesson_36.code.lessoncode.generics2.DoubleData;
import lesson_36.code.lessoncode.generics2.OnlyNumber;

public class NumberDemo {
    public static void main(String[] args) {
        lesson_36.code.lessoncode.generics2.DoubleData doubleData = new DoubleData();
        IntegerData integerData = new IntegerData();

        doubleData.number = 10.54;
        integerData.number = 15;


        OnlyNumber<Integer> integerOnlyNumber = new OnlyNumber<>(10);
        OnlyNumber<Double> doubleOnlyNumber = new OnlyNumber<>(10.5);

        integerOnlyNumber.printNumber();
        doubleOnlyNumber.printNumber();

        doubleOnlyNumber.printSquare();
        integerOnlyNumber.printSquare();

//        OnlyNumber<String> stringOnlyNumber = new OnlyNumber<>("число");
//        stringOnlyNumber.printNumber();

    }
}
