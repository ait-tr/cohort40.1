package lesson_32.code.lessoncode.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        Queue<Integer> integerQueue = new LinkedList<>();

        // добавляю новые элементы в очередь

        integerQueue.add(1);
        integerQueue.offer(2);
        integerQueue.offer(3);

        System.out.println("Очередь после добавления элементов:"  + integerQueue);

        // посмотреть (но не удалять из коллекции) головной элемент очереди

        Integer head = integerQueue.peek(); // или element()
        System.out.println("Головной элемент: " + head);
        System.out.println("Очередь элементов:"  + integerQueue);


        // вытаскиваем из коллекции элемент с его удалением из коллекции
        while (!integerQueue.isEmpty()){
            System.out.println("Вытащен и удален элемент : " + integerQueue.poll());
            System.out.println("Очередь элементов:"  + integerQueue);

        }

       // System.out.println(integerQueue.poll());

    }
}
