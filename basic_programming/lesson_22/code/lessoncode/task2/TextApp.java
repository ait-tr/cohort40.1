package lesson_22.code.lessoncode.task2;

import java.util.Arrays;

public class TextApp {
    public static void main(String[] args) {
        TextSource source = new TextSource();
        TextUtil util = new TextUtil();

        String[] textArray = util.prepareTextArray(source.createText());

        System.out.println(Arrays.toString(textArray));

        System.out.println(Arrays.toString(util.reverseSortTextArray(textArray)));

        System.out.println("Самое длинное слово в тексте: " + util.findLongestWord(textArray));

        System.out.println("Число повторений слова 'компиляция' - " + util.countWordOccurrences(textArray,"компиляция"));
    }
}
