package lesson_34.code.lessoncode.differentCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqAndSearchAndSortElementExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();


        int size = 1_000_000;

        for (int i = 0; i < size; i++) {
            int randomIndex = (int) (Math.random() * size);
            numbers.add(randomIndex);
        }

        System.out.println(numbers);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            int randomIndex = (int) (Math.random() * size);
            boolean isContains = numbers.contains(randomIndex);
            //      System.out.println("Значение элемента с индексом " + randomIndex + " : " + numbers.get(randomIndex));
        }
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
