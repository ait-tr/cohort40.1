package lesson_06.code.lessoncode.stringOperatons;

public class WorkWithString1 {
    public static void main(String[] args) {
        String text = "Это текст для проверки работы методов типа String";

        System.out.println(text);

        System.out.println("Получение символа из строки по его индексу");

        char symbol1 = text.charAt(0);
        System.out.println(symbol1);

        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

        // System.out.println(text.charAt(49)); - ошибка потому что
        // при длине строки в 49 символов индекс изменяется от 0 до 48

        System.out.println(" получение подстроки из целого текста");
        System.out.println(" возможно либо от одного индекса до другого ");
        System.out.println(" либо от одного индекса до конца строки");

        String substringText1 = text.substring(40);
        String substringText2 = text.substring(0,12);

        System.out.println(substringText1);
        System.out.println(substringText2);

    }
}
