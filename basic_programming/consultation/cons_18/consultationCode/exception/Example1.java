package consultation.cons_18.consultationCode.exception;


import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.InputMismatchException;

public class Example1 {
    public static void main(String[] args) {


            UserInput ui = new UserInput();

        try {

            int x = ui.inputInteger("Введите первое число");
            int y = ui.inputInteger("Введите второе число");

            System.out.println("Результат деления: " + divide(x, y));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("неправильный ввод данных");
            }

        System.out.println("Программа нормально завершила свою работу");


    }

    static double divide(int x, int y){
        double result = x / y;
        return result;
    }
}
