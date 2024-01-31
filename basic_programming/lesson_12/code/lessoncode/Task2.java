package lesson_12.code.lessoncode;

import lesson_06.code.lessoncode.scanner.UserInput;

public class Task2 {
    /*
    проверить является ли число которое ввел пользователь - простым
   (делится без остатка только на 1 и на себя)

   1. запросить и получить число у пользователя
   2. простое число - такое число которое делится без остатка ТОЛЬКО на себя и на 1

   надо проверить ВСЕ числа от 2 до нашего числа и получить ответ на вопрос:
   если мы число пользователя разделим на очередное число из интервала то будет остаток или нет

   Для этого нам нужно пройтись в цикле от 2 до числа пользователя и проверить есть остаток от деления или нет

   если мы найдем ХОТЯ БЫ ОДНО число из цикла которое дает остаток 0 - то значит число не простое

     */

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        SimpleNumber simpleNumber = new SimpleNumber();

        int userInt = userInput.inputInteger("Please enter integer number: ");

        boolean isSimple = simpleNumber.isSimple(userInt);

        if (isSimple) {
            System.out.println("Число " + userInt + " является простым.");
        } else {
            System.out.println("Число " + userInt + " не является простым.");
        }
    }

}
