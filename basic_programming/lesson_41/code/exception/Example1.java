package lesson_41.code.exception;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_39.code.standartFunctionalInterfaces.User;

public class Example1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int x = ui.inputInteger("Введите первое число");
        int y = ui.inputInteger("Введите второе число");

        System.out.println("результат деления: " + divide(x, y));
        System.out.println("Программа завершила свою работу");

    }

    static double divide(int x, int y){
        return x / y;
    }
}
