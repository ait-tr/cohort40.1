package lesson_13.code.lessoncode.arrayWithMethods;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.Arrays;

public class UseArrayForWorkWithMethods {
    public static void main(String[] args) {
       /*
       будем использовать методы для работы с массивами

       создадим класс ArrayService
       в котором создаим вспомогательные методы

       1) метод createArray - суть которого в создании нового массива
       2) fillArray - заполнение массива
       3) sumCalculate
       4) findMax
        */

        ArrayService service = new ArrayService();

        int[] ourWorkingArray = service.createArray();

        service.fillArray(ourWorkingArray);

        System.out.println(Arrays.toString(ourWorkingArray));

        int sumAllElements = service.sumAllElements(ourWorkingArray);

        System.out.println("Сумма всех элементов: " + sumAllElements);

       int maxElementValue = service.findMax(ourWorkingArray);

        System.out.println("Максимальное значение = " + maxElementValue);


        int avg = service.avgAllElements(ourWorkingArray);

        System.out.println("Average = " + avg);

    }
}
