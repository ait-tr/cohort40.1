package lesson_29.code.lessoncode.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("One");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Four");


        System.out.println(list);

        Set<String> strings = new HashSet<>();
        // -----
        strings.addAll(list);

        System.out.println(strings);


        //------------

        List<String> newListUniq = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            String currentElement = list.get(i);

            if (!newListUniq.contains(currentElement)) {
                newListUniq.add(list.get(i));

            }
        }

        System.out.println(newListUniq);

        // ------ альтернативный вариант ------

        Set<String> setUniq = new HashSet<>(list);

        List<String> listUniq = new ArrayList<>(setUniq);

        System.out.println(listUniq);

    }
}
