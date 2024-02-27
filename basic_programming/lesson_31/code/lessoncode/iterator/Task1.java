package lesson_31.code.lessoncode.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();

        integers.add(1);
        integers.add(5);
        integers.add(2);
        integers.add(6);
        integers.add(8);
        integers.add(3);
        integers.add(4);
        integers.add(9);
        integers.add(7);
        integers.add(10);

        System.out.println("Original list: " + integers);
        removeNumber(integers, 5);
        System.out.println("Modified list: " + integers);
    }

    public static void removeNumber(Set<Integer> list, int number) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            if (currentNumber > number) {
                iterator.remove();
            }
        }
    }
}
