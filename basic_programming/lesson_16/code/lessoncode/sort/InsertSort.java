package lesson_16.code.lessoncode.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        /*
        {8,3,5,2,1,4,7,6} - исходный массив

        {8, || 3,5,2,1,4,7,6} - идем по массиву слева на право и "ступеньками" добавляя по одному элементу делаем сортировку левой части
        {8, 3,|| 5,2,1,4,7,6}
        {3, 8,|| 5,2,1,4,7,6}
        {3, 8, 5, || 2,1,4,7,6}
        {3, 5, 8, || 2,1,4,7,6}
        {3, 5, 8, 2, || 1,4,7,6}
        {2, 3, 5, 8, || 1,4,7,6}
        {2, 3, 5, 8, 1, || 4,7,6}
        {1, 2, 3, 5, 8, || 4,7,6}
        {1, 2, 3, 5, 8, 4, || 7,6}
        {1, 2, 3, 4, 5, 8, || 7,6}
        {1, 2, 3, 4, 5, 8, 7, || 6}
        {1, 2, 3, 4, 5, 7, 8, || 6}
        {1, 2, 3, 4, 5, 7, 8, 6}
        {1, 2, 3, 4, 5, 6, 7, 8}

        {1,2,3,4,5,6,7,8}
        ------------------

         */

        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("---------------------------");


        for (int i = 0; i < arrayForSort.length; i++) {
            System.out.println("Iteration " + i);
            System.out.println(Arrays.toString(arrayForSort));

            int currentElement = arrayForSort[i];

            int j = i - 1;

            while ((j>=0) && (currentElement < arrayForSort[j])) {
                arrayForSort[j + 1] = arrayForSort[j];
                j--;
            }
            arrayForSort[j + 1] = currentElement;

        }

        System.out.println("----------------------");
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));

    }
}
