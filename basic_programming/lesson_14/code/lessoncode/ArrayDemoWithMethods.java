package lesson_14.code.lessoncode;

import java.util.Arrays;

public class ArrayDemoWithMethods {
    public static void main(String[] args) {
         /*
        1) получить длину массива от пользователя
        2) создание массива нужной длины
        3) получить интервал от пользователя
        4) заполнить массив случайными числами в определенном интервале
        5) вывести информацию о массиве на экран
         */


        // создаем экземпляры нужных нам классов чтобы иметь
        // возможность воспользоваться методами которые в них есть

        ArrayService service = new ArrayService();
        UserInput userInput = new UserInput();

        int lengthForOurArray = userInput.inputInteger("Введите длину массива: ");

        int[] myArray = service.createIntArray(lengthForOurArray);

        System.out.println(Arrays.toString(myArray));

        int intervalStart = userInput.inputInteger("Введите начальное значение диапазона чисел: ");

        int intervalEnd = userInput.inputInteger("Введите конечное значение диапазона чисел: ");



    }
}