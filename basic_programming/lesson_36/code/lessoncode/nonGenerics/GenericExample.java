package lesson_36.code.lessoncode.nonGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // типизированный тип - с уточнением конкретного типа данных

        list.add("Hello!");
        list.add("123");

        printList(list);


    }

    public static void printList(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String myElement = list.get(i);
            System.out.println("Длина слова = " + myElement.length());
        }
    }
}
