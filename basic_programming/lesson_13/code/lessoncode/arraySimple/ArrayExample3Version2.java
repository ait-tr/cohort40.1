package lesson_13.code.lessoncode.arraySimple;

import java.util.Arrays;

public class ArrayExample3Version2 {
    public static void main(String[] args) {
        int[] oldArray = {10,20,30,40,50,60,70,80,90,100,110,120,130};

        System.out.println(Arrays.toString(oldArray));

        // создать новый массив в котором будут значения
        // которые будут равны сумме двух соседних элементов из первого массива
        /*
        1) длина нового массива будет равна длина старого / 2
        2) в цикле по СТАРОМУ массиву с шагом +2 нам нужно
        взять значение из текущего элемента, прибавить значение из следующего
        и эту сумму сохранить в каком-то элементе НОВОГО массива
        3) если в старом массиве индекс элементов будет 0 и 1
        то в новом индекс будет 0
        если в старом массиве индекс элементов будет 2 и 3
        то в новом индекс будет 1
        если в старом массиве индекс элементов будет 4 и 5
        то в новом индекс будет 2

        если в старом массиве индекс элементов будет i и i+1
        то в новом индекс будет i / 2

         */

        int[] newArray = new int[oldArray.length / 2];

        for (int i = 0; i < oldArray.length; i = i + 2) {
            int indexForNewArray = i / 2;
            newArray[indexForNewArray] = oldArray[i] + oldArray[i + 1];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
