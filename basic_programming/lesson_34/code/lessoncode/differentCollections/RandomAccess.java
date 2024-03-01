package lesson_34.code.lessoncode.differentCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RandomAccess {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }

        // быстрый доступ к рандомному элементу

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            int randomIndex = (int) (Math.random() * numbers.size());
            int element = numbers.get(randomIndex);
      //      System.out.println("Значение элемента с индексом " + randomIndex + " : " + numbers.get(randomIndex));
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
     }
}
