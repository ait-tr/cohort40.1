package lesson_13.code.lessoncode.arrayWithMethods;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.Arrays;

public class UseArrayForWorkWithoutMethods {
    public static void main(String[] args) {
        /*
        1) Создать массив той длины, которую введет пользователь
        2) наполнить массив данными, которые введет пользователь
        3) посчитать сумму всех элементов массива
        4) найти максимальное значение среди элементов массива


        для п1:

        - создать Сканер (или использовать наш класс UserInput)
        - запросить у пользователя длину массива
        - создать массив нужной длины

        для п2:
        в цикле по длине массива для каждого элемента массива нужно
        запросить у пользователя данные и сохранить то что он ввел
        в соответствующей ячейке массива

        для п3:
        объявляем переменную Sum в которой будет хранится сумма
        всех элементов и присваиваем ей первоначальное значение 0

        в цикле по длине массива мы к этой переменной добавляем
        значение i-ого элемента нашего массива

        для п4:

        объявляем переменную Max в которой будет хранится максимальное
        значение из всех элементов и присваиваем ей первоначальное значение
        из элемента с индексом 0 нашего массива

        в цикле по всем элементам мы сравниваем каждый элемент со значением
        которое хранится в переменной Max

        если вдруг наш текущий элемент массива оказывается больше чем то значение
        которое на текущий момент времени хранится в переменной Max, от это означает
        что в переменную Max надо сохранить значение из текущего элемента массива

         */

        UserInput userInput = new UserInput();

        int lengthOurArray = userInput.inputInteger("введите длину массива");

        int[] workingArray = new int[lengthOurArray];

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = userInput.inputInteger("Введите значение " + i + "-ого элемента массива");
        }

        System.out.println(Arrays.toString(workingArray));

        int sumAllElements = 0;

        for (int i = 0; i < workingArray.length; i++) {
            sumAllElements += workingArray[i];
    // сокращенная форма записи, эквивалентно: sumAllElements = sumAllElements + workingArray[i];
        }

        System.out.println("Сумма всех элементов: " + sumAllElements);

        int maxElementValue = workingArray[0];
        // берем в качестве начального значения - значение первого элемента, а не 0
        // потому что массив может содержать только отрицательные значения и тогда
        // 0 всегда будет больше любого другого элемента

        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] > maxElementValue) {
                maxElementValue = workingArray[i];
            }
        }

        System.out.println("Максимальное значение = " + maxElementValue);



    }
}
