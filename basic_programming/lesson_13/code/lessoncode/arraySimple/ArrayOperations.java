package lesson_13.code.lessoncode.arraySimple;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] intArray1 = new int[5];

        intArray1[0] = 0;
        intArray1[1] = 10;
        intArray1[2] = 30;
        intArray1[3] = 50;
        intArray1[4] = 99;

        System.out.println(Arrays.toString(intArray1));

        System.out.println("Длина массива = " + intArray1.length);

        int[] arrayDublicate = intArray1.clone();

        System.out.println("Сделали дубликат :");
        System.out.println(Arrays.toString(arrayDublicate));


    }
}
