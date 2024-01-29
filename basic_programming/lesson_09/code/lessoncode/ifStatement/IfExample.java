package lesson_09.code.lessoncode.ifStatement;

import lesson_06.code.lessoncode.scanner.UserInput;


public class IfExample {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int x = ui.inputInteger("Please enter integer number: ");

        if (x < 0) {
            System.out.println("Вы ввели отрицательное число!");
        } else if ((x >= 0) && (x < 100)) {
            System.out.println("Вы ввели положительное число от 0 до 99");
        } else if ((x >= 100) && (x <= 1000)) {
            System.out.println("Вы ввели положительное число от 100 до 1000");
        } else {
            System.out.println("Вы ввели положительное число больше чем 1000");
        }


        if ((x < 0) || (x > 10000)) {
            System.out.println("Вы ввели число которое не подходит для нашей задачи");
        }


    }
}
