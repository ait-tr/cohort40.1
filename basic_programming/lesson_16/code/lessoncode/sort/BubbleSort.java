package lesson_16.code.lessoncode.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        /*
        {8,3,5,2,1,4,7,6} - исходный массив
        {3,8,5,2,1,4,7,6} - сравниваем первые два элемента и если левый больше, то меняем их местами

        {3,5,8,2,1,4,7,6} - сравниваем вторую пару чисел ...
        {3,5,2,8,1,4,7,6}
        {3,5,2,1,8,4,7,6}
        {3,5,2,1,4,8,7,6}
        {3,5,2,1,4,7,8,6}
        {3,5,2,1,4,7,6,8} - самый большой элемент оказался на последнем месте

        -----------------------
        {3,5,2,1,4,7,6,8} - сравниваем первую пару - ничего не меням
        {3,2,5,1,4,7,6,8}
        {3,2,1,5,4,7,6,8}
        {3,2,1,4,5,7,6,8}
        {3,2,1,4,5,7,6,8} - 5 и 7 менять не надо
        {3,2,1,4,5,6,7,8}

        ------------------
        {3,2,1,4,5,6,7,8} - опять сравниваем первую пару
        {2,3,1,4,5,6,7,8}
        {2,1,3,4,5,6,7,8}
        ------------------

        {2,1,3,4,5,6,7,8} - опять сравниваем первую пару
        {1,2,3,4,5,6,7,8}
        ------------------

         */

        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("---------------------------");
    boolean notSorted = true;

    int temp;

    // {1,2,3,4,5,6,8,7} - если мы меняем ХОТЯ БЫ одну пару - то это означает, что у нас массив не отсортирован
    // {1,2,3,4,5,6,7,8}

        while (notSorted) {


           // System.out.println(Arrays.toString(arrayForSort));

            notSorted = false;

            for (int i = 0; i < arrayForSort.length - 1; i++) {

                if (arrayForSort[i] > arrayForSort[i + 1]) {
                    temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i + 1];
                    arrayForSort[i + 1] = temp;
                    notSorted = true;
                }
                System.out.println(Arrays.toString(arrayForSort));
            }
            System.out.println("----------------------");
        }

        System.out.println("----------------------");
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));

    }
}
