package lesson_36.code.lessoncode.nonGenerics;

import java.util.ArrayList;
import java.util.List;

public class NonGenericExample {
    public static void main(String[] args) {

        List list = new ArrayList(); // raw types - сырой тип

        list.add("Hello!");
        list.add(123);

        printList(list);


    }

    public static void printList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            String myElement = (String) list.get(i);
            System.out.println("Длина слова = " + myElement.length());
        }
    }
}
