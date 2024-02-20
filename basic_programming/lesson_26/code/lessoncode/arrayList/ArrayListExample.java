package lesson_26.code.lessoncode.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> listString = new ArrayList<>();


        System.out.println(listString);

        System.out.println(listString.size());

        listString.add("text1");
        listString.add("text2");
        listString.add("text3");
        listString.add("text5");
        listString.add("text6");
        listString.add("text7");
        listString.add("text8");
        listString.add("text9");


        System.out.println(listString);
        System.out.println("Размер коллекции: " + listString.size());

        listString.add(1,"text4");
        System.out.println(listString);

        listString.remove("text4");
        System.out.println(listString);

        System.out.println("Элемент для индекса № 1 = " + listString.get(1));

        listString.remove(1);

        System.out.println(listString);

        System.out.println("Элемент для индекса № 1 = " + listString.get(1));


    }
}
