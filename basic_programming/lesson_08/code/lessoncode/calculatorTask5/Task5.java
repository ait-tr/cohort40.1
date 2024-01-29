package lesson_08.code.lessoncode.calculatorTask5;

public class Task5 {
    /*
Реализовать программу, выводящую на экран результаты сложения,
вычитания, умножения и деления двух чисел, введенных пользователем.
Каждая из арифметических операций должна быть реализована как отдельный метод.
Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.

1) запросить значение первого параметра у пользователя
2) полученное значение сохранить в переменной1
3) запросить значение второго параметра у пользователя
4) полученное значение сохранить в переменной2
5) совершить операцию с этими данными и полученный результат сохранить в переменной
6) вывести сообщение о результате операции пользователю


класс № 1 - ввод данных от пользователя
класс № 2 - набор методов для операций с данными
основной класс с методом main в котором мы пропишем всю последовательность (логику) наших действий

     */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        SourceDataForCalculator source = new SourceDataForCalculator();

        System.out.println("Please enter first number");
        double firstNumber = source.inputDouble();

        System.out.println("Please enter second number");
        double secondNumber = source.inputDouble();

        System.out.println("Math operation results:");
        System.out.println("Sum: " + calculator.sum(firstNumber,secondNumber));
        System.out.println("Sub: " + calculator.sub(firstNumber,secondNumber));
        System.out.println("Multiplication: " + calculator.multiplication(firstNumber,secondNumber));
        System.out.println("Divide: " + calculator.div(firstNumber,secondNumber));


    }
}
