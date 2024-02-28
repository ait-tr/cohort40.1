package lesson_32.code.lessoncode.forEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachExample {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        integers.add(10);
        integers.add(2);


        System.out.println(integers);


        for (Integer currentInteger : integers){
            System.out.println(currentInteger);
            Integer square = currentInteger * currentInteger;
            System.out.println("Квадрат числа = " + square);
        }
    }
}
