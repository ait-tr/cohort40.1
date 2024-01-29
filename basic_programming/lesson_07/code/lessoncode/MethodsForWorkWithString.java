package lesson_07.code.lessoncode;

public class MethodsForWorkWithString {

    public void lastLineSymbol(String textLine) {
        // вычисляем индекс последнего символа
        int lastIndex = textLine.length() - 1;
        // получаем последний символ по индексу
        char lastSymbol = textLine.charAt(lastIndex);

        System.out.println("Последний символ строки: " + lastSymbol);

        System.out.println("Проверка содержания в нашей строке 'Java'");

        String inOurLine = "Java";

        boolean containsJava = textLine.contains(inOurLine);

        System.out.println("Содержит ли наша строка текст 'Java' ?: " + containsJava);

        String ourLineToUpperCase = textLine.toUpperCase();

        String ourLineToLowCase = textLine.toLowerCase();

        System.out.println("Наш текст в верхнем регистре: " + ourLineToUpperCase);

        System.out.println("Наш текст в нижнем регистре: " + ourLineToLowCase);

    }
}
