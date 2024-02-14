package lesson_22.code.lessoncode.task2;

public class TextUtil {
    /*
    количества вхождений слова,
нахождение самого длинного слова
обратная сортировка слов по алфавиту.

     */

    public String[] prepareTextArray(String textSource){
        textSource = textSource.trim();
        textSource = textSource.replaceAll("—","");
        textSource = textSource.replaceAll("\\.","");
        textSource = textSource.replaceAll(",","");
        textSource = textSource.replaceAll("\\(","");
        textSource = textSource.replaceAll("\\)","");

        textSource = textSource.replaceAll("  "," ");
        textSource = textSource.toLowerCase();
        return textSource.split(" ");
    }

    // Подсчет количества вхождений заданного слова в текст
    public int countWordOccurrences(String[] textSource, String wordTarget){
        int count = 0;
        for (int i = 0; i < textSource.length; i++) {
            if (textSource[i].equals(wordTarget)) {
                count++;
            }
        }
        return count;
    }


    // Найти самое длинное слово в тексте

    public String findLongestWord(String[] textSource){
        String longestWord = "";
        for (int i = 0; i < textSource.length; i++) {
            if (textSource[i].length() > longestWord.length()) {
                longestWord = textSource[i];
            }
        }
        return longestWord;
    }


    // сортировка по алфавиту в обратном порядке

    public String[] reverseSortTextArray(String[] textSource) {

        String[] reversed = textSource.clone();

        for (int i = 0; i < reversed.length - 1; i++) {
            for (int j = 0; j < reversed.length - 1 - i; j++) {
                if (reversed[j].compareTo(reversed[j + 1]) < 0) {
                    String tempWord = reversed[j];
                    reversed[j] = reversed[j + 1];
                    reversed[j + 1] = tempWord;
                }
            }
        }
        return reversed;
    }

}
