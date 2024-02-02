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

        ArrayService service = new ArrayService();

       // int[] myArray = new int[15];

        int[] myArray = service.createIntArray(5);

        System.out.println(Arrays.toString(myArray));



    }
}
