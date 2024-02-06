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



        System.out.println("----------------------");
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));

    }
}
