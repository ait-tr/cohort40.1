package lesson_14.code.lessoncode.arrayInt;

import java.util.Random;

public class ArrayService {
     /*
        1) получить длину массива от пользователя
        2) создание массива нужной длины
        3) получить интервал от пользователя
        4) заполнить массив случайными числами в определенном интервале
        5) вывести информацию о массиве на экран
         */

    public int[] createIntArray(int arrayLength){
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public void fillArrayRandom(int[] workingArray, int startValue, int endValue){
        /*
        1. воспользоваться классом Random
        2. в цикле от 0 до конца массива для КАЖДОГО элемента нужно:
            - вычислить рандомное число из диапазона от startValue до  endValue
            - сохранить это значение с i-ом элементе массива
         */

        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            int randomValue = random.nextInt(startValue, endValue);
            workingArray[i] = randomValue;
        }

    }

    public void printArrayData(int[] workingArray){
        System.out.println("Данные элементов массива:");
        for (int i = 0; i < workingArray.length; i++) {
            System.out.print(workingArray[i] + ", ");
        }
        System.out.println();
    }

}
