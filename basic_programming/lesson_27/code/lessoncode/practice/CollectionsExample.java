package lesson_27.code.lessoncode.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("text1");
        strings.add("text2");
        strings.add("text3");
        strings.add("text4");
        strings.add("text5");
        strings.add("text6");
        strings.add("text7");

        List<String> linkedString = new LinkedList<>(strings);

        CollectionsUtil.printCollection(linkedString);

    }
}
