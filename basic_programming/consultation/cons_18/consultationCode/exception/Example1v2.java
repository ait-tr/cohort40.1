package consultation.cons_18.consultationCode.exception;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.InputMismatchException;

public class Example1v2 {
    public static void main(String[] args) {


            UserInput ui = new UserInput();
        int x;
        int y;

        try {
            x = ui.inputInteger("Введите первое число");
        } catch (InputMismatchException e) {
            System.out.println("неправильный ввод данных");
            System.out.println("Используем значение по умолчанию = 1 ");
            x = 1;
        }

        try {
            y = ui.inputInteger("Введите второе число");
        } catch (InputMismatchException e) {
            System.out.println("неправильный ввод данных");
            System.out.println("Используем значение по умолчанию = 1 ");
            y = 1;
        }



        try {
            System.out.println("Результат деления: " + divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Программа нормально завершила свою работу");


    }

    static double divide(int x, int y){
        double result = x / y;
        return result;
    }
}
