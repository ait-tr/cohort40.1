package lesson_31.code.lessoncode.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test2 {
    public static void main(String[] args) {

            List<String> strings = new ArrayList<>();
            strings.add("apple");
            strings.add("banana");
            strings.add("cherry");
            strings.add("date");

            System.out.println("Original list: " + strings);
            replaceString(strings,"a","...");
            System.out.println("Modified list: " + strings);
        }

        public static void replaceString(List<String> list, String checkContain, String replaced) {
            ListIterator<String> iterator = list.listIterator();
            while (iterator.hasNext()) {
                String currentString = iterator.next();
                if (currentString.contains(checkContain)) {
                    iterator.set(replaced);
                }
            }
        }
}
