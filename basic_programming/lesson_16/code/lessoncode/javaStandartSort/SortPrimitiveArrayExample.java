package lesson_16.code.lessoncode.javaStandartSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortPrimitiveArrayExample {
    public static void main(String[] args) {
        int[] arrayInt = {10,3,1,6,11,1,5,2,7,8,9,4};

        System.out.println(Arrays.toString(arrayInt));

        Arrays.sort(arrayInt);

        System.out.println(Arrays.toString(arrayInt));

    }
}
