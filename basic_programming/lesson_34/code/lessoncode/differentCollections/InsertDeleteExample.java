package lesson_34.code.lessoncode.differentCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertDeleteExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            int randomIndex = (int) (Math.random() * numbers.size());
            numbers.add(0,i);
        }

        // быстрый доступ к рандомному элементу

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);


        startTime = System.currentTimeMillis();

       while (!numbers.isEmpty()) {
           numbers.remove(0);
       }

        // быстрый доступ к рандомному элементу

        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
