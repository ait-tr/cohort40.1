package lesson_25.code.lessoncode.enumExample2;

import java.util.Arrays;

public class MonthDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MonthWithDays.values()));

        System.out.println();

        System.out.println(Arrays.toString(MonthWithDays.getSummerMonths()));
    }
}
