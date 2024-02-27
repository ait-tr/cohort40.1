package lesson_31.code.lessoncode.iterator;

import java.util.HashSet;
import java.util.Set;

public class ChangeSetCollection {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
        // добавить в коллекцию число 10 если в вашей коллекции есть число 5

        Set<Integer> copyOfNumbers = new HashSet<>(numbers);

        for (Integer number : copyOfNumbers) {
            if (number == 5) {
                numbers.add(10);
            }
        }

        System.out.println(numbers);
    }
}
