package lesson_11.code.lessoncode.whileLoop;

import lesson_06.code.lessoncode.scanner.UserInput;

public class Example1 {
     /*
        попросить у пользователя ввести два целых числа
        вычислить их сумму и напечатать

        повторять до тех пор, пока сумма меньше 100
         */

    public static void main(String[] args) {
        int x;
        int y;
        int result;
        UserInput userInput = new UserInput();

        boolean condition = true;

        while (condition) {
            System.out.println("Please enter two integer numbers:");

            x = userInput.inputInteger("Please enter first number: ");
            y = userInput.inputInteger("Please enter second number: ");

            result = x + y;

            System.out.println("Result of sum: " + result);

            if (result > 100) {
                condition = false;
            }

        }

        System.out.println("цикл завершил свою работу!");
    }
}
