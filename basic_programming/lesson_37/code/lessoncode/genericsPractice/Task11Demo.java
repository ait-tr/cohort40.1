package lesson_37.code.lessoncode.genericsPractice;

import lesson_36.code.lessoncode.genericsPractice.Task11;

public class Task11Demo {

    public static void main(String[] args) {

        lesson_36.code.lessoncode.genericsPractice.Task11<Integer> test1 = new lesson_36.code.lessoncode.genericsPractice.Task11<>(15);
        System.out.println(test1.getObj());

        lesson_36.code.lessoncode.genericsPractice.Task11<String> test2 = new Task11<>("Java");
        System.out.println(test2.getObj());
    }

}
