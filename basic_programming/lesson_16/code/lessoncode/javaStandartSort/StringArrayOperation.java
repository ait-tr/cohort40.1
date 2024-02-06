package lesson_16.code.lessoncode.javaStandartSort;

import java.util.Arrays;

public class StringArrayOperation {
    public static void main(String[] args) {
        String text = "Создайте массив из всех нечётных чисел от 1 до 99," +
                "    выведите его на экран в строку в обратном порядке" +
                "   Создайте массив из 15 случайных целых чисел из отрезка [0;9]." +
                "   Подсчитайте сколько в массиве чётных элементов и" +
                "   выведете это количество на экран на отдельной строке." +
                "   Создать массив типа String с размером 7." +
                "   Записать в него значения дней недели." +
                "   Вывести на консоль значение последнего элемента." +
                "   Найти максимальный по значению элемент";

      //  System.out.println(text);

        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace("  ", " ");
        text = text.replace("  ", " ");
        text = text.trim();


        String[] textArray = text.split(" ");

        System.out.println(Arrays.toString(textArray));

//        for (int i = 0; i < textArray.length; i++) {
//            textArray[i] = textArray[i].trim();
//        }
//
//        System.out.println(Arrays.toString(textArray));


//        System.out.println("hello 123".replaceAll("[0-9]", "\\$"));

    }
}
