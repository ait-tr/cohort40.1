package lesson_36.code.lessoncode.generic2;

public class NumberDemo {
    public static void main(String[] args) {
        DoubleData doubleData = new DoubleData();
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
