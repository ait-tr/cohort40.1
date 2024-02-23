package lesson_29.code.lessoncode.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample3 {
    /*
    Дан текст - вывести список уникальных слов в этом тексте
     */
    public static void main(String[] args) {
        String text = "В Java, `enum` (или перечисление) используется для определения коллекции именованных констант. " +
                "Эти константы могут быть примитивными значениями или комплексными объектами. Использование `enum` " +
                "в Java помогает сделать код более читаемым и безопасным, поскольку оно ограничивает возможные значения " +
                "переменной до предопределённого набора.";



        String correctedText = text.toLowerCase();
        correctedText = correctedText.replace(",","");
        correctedText = correctedText.replace("  "," ");
        correctedText = correctedText.replace("(","");
        correctedText = correctedText.replace(")","");
        correctedText = correctedText.replace(".","");
        correctedText = correctedText.replace("`","");

        String[] words = correctedText.split(" ");

        List<String> wordList = Arrays.asList(words);

        Set<String> wordSet = new HashSet<>(wordList);

        System.out.println(wordSet);
    }
}
