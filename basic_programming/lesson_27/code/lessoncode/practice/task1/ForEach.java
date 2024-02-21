package lesson_27.code.lessoncode.practice.task1;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);


        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            integers.set(i, integers.get(i) * integers.get(i));
        }

        System.out.println(integers);


        for (Integer currentElement : integers){
            Integer result = currentElement * currentElement;
         //   integers.set() - нет возможности заменить элемент коллекции на другой
        }
    }
}
