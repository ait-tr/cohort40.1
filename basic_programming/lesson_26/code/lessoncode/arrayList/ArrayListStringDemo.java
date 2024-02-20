package lesson_26.code.lessoncode.arrayList;

import java.util.ArrayList;

public class ArrayListStringDemo {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        System.out.println(stringArrayList.size());

        stringArrayList.add("First");
        System.out.println(stringArrayList.size());

        String firstElement = stringArrayList.get(0);
        System.out.println(firstElement);

        stringArrayList.add(0,"Second");
        System.out.println(stringArrayList);

        stringArrayList.add(0,"Third");
        System.out.println(stringArrayList);
        System.out.println(" Элемент с индексом 0 -> " + stringArrayList.get(0));


        stringArrayList.remove(0);
        System.out.println(stringArrayList);

        System.out.println(" Элемент с индексом 0 -> " + stringArrayList.get(0));

        System.out.println("Индекс у элемента 'First' равен: " + stringArrayList.indexOf("First"));

        stringArrayList.set(1,"New First Element");
        System.out.println(stringArrayList);

    }
}
