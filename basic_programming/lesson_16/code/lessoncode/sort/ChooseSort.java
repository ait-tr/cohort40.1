package lesson_16.code.lessoncode.sort;

import java.util.Arrays;

public class ChooseSort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        /*
        {8,3,5,2,1,4,7,6} - исходный массив

        {8,|| 3,5,2,1,4,7,6} - берем левый элемент - сравниваем его со всеми из правой части, находим минимальный элемент из правой части и меняем их местами
        {1,|| 3,5,2,8,4,7,6}
        {1,3, || 5,2,8,4,7,6}
        {1,2, || 5,3,8,4,7,6}
        {1,2,5, || 3,8,4,7,6}
        {1,2,3, || 5,8,4,7,6}
        {1,2,3,5, || 8,4,7,6}
        {1,2,3,4, || 8,5,7,6}
        {1,2,3,4,8, || 5,7,6}
        {1,2,3,4,5, || 8,7,6}
        {1,2,3,4,5,8, || 7,6}
        {1,2,3,4,5,6, || 7,8}
        {1,2,3,4,5,6,7, || 8}

        {1,2,3,4,5,6,7,8}
        ------------------

         */

        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("---------------------------");

        for (int i = 0; i < arrayForSort.length; i++) {
            System.out.println("Iteration " + i);
            System.out.println(Arrays.toString(arrayForSort));

            int min = arrayForSort[i];
            int minId = i;

            for (int j = i + 1; j < arrayForSort.length; j++) {
                if (arrayForSort[j] < min) {
                    min = arrayForSort[j];
                    minId = j;
                }
            }

            System.out.println(i + " element - " + arrayForSort[i] + " will be change with element index: " + minId + " value: " + min );

            int temp = arrayForSort[i];
            arrayForSort[i] = min;
            arrayForSort[minId] = temp;

        }


        System.out.println("----------------------");
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));

    }
}
