package lesson_16.code.lessoncode.javaStandartSort;

import java.util.Arrays;

public class SortStringArrayExample {
    public static void main(String[] args) {
        String[] arrayString = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(arrayString));

        Arrays.sort(arrayString);

        System.out.println(Arrays.toString(arrayString));



    }
}
