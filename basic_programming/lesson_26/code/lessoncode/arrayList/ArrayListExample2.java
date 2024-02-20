package lesson_26.code.lessoncode.arrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();

        System.out.println(listInt);

        for (int i = 0; i < 10; i++) {
            listInt.add(i);
            System.out.println(listInt);
        }


        ArrayList<String> listStrings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listStrings.add("String # " + i);
            System.out.println("List length (size) = " + listStrings.size());
            System.out.println(listStrings);
        }
    }
}
