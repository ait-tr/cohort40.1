package lesson_32.code.lessoncode.dequeu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        // а могли бы использовать LinkedList()

        // добавляем элементы
        integerDeque.addFirst(1); //добавить в начало
        integerDeque.addLast(2); //добавить в конец
        integerDeque.addFirst(0); //добавить в начало
        integerDeque.addLast(3); //добавить в конец

        System.out.println("Dequeue после добавления элементов: " + integerDeque);

        Iterator<Integer> iterator = integerDeque.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Просмотр элементов в начале и конце
        Integer firstElement = integerDeque.peekFirst();
        Integer lastElement = integerDeque.peekLast();

        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Последний элемент: " + lastElement);


        // Удаление элементов

        System.out.println(integerDeque.removeFirst());
        System.out.println(integerDeque.removeLast());
        System.out.println("Dequeue после удаления элементов: " + integerDeque);

        System.out.println(integerDeque.pollFirst());
        System.out.println(integerDeque.pollLast());
        System.out.println("Dequeue после удаления элементов: " + integerDeque);

        System.out.println(integerDeque.pollFirst());

        System.out.println("Наша коллекция пустая? " + integerDeque.isEmpty());

    }

}
