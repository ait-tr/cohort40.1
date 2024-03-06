package lesson_37.code.lessoncode.genericsPractice;

import lesson_36.code.lessoncode.genericsPractice.Task12;

public class Task12Demo {
    public static void main(String[] args) {


        lesson_36.code.lessoncode.genericsPractice.Task12<Integer, String> test21demo = new lesson_36.code.lessoncode.genericsPractice.Task12<>(25,"Generics");
        test21demo.print();

        lesson_36.code.lessoncode.genericsPractice.Task12<String, Integer> test22demo = new Task12<>("James Bond", 7);
        test22demo.print();
    }
}
