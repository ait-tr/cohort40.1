package stringOperatons;

public class WorkWithString1 {
    public static void main(String[] args) {
        String text = "Это текст для проверки работы методов типа String";

        System.out.println(text.length());

        System.out.println("Получение символа из строки по его индексу");

        char symbol1 = text.charAt(0);
        System.out.println(symbol1);

        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

        // System.out.println(text.charAt(49)); - ошибка потому что
        // при длине строки в 49 символов индекс изменяется от 0 до 48

        System.out.println(" получение ");


    }
}
