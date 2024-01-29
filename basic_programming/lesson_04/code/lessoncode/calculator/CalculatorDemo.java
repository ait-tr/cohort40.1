package lesson_04.code.lessoncode.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 25;
        calculator.sum(a, b);
        calculator.multiplication(a, b);

        calculator.sum(10,55);
    }
}
