package lesson_06.code.lessoncode.stringOperatons;

public class WorkWithString {
    public static void main(String[] args) {

        String str1 = "      ";
        String text = "Это текст для проверки работы методов класса String";
        String text1 = "";

        int myTextLength = text.length();

        System.out.println("==== вычисление длины строки ======");
        System.out.println(myTextLength);


        System.out.println("==== проверка строки на наличие любых символов ======");
        boolean isMyStrEmpty = str1.isEmpty();
        System.out.println(isMyStrEmpty);

        boolean isMyText1Empty = text1.isEmpty();
        System.out.println(isMyText1Empty);

        System.out.println("==== проверка строки на наличие любых символов кроме пробела ======");
        boolean isMyStrBlank = str1.isBlank();
        System.out.println(isMyStrBlank);

        boolean isMyText1Blank = text1.isBlank();
        System.out.println(isMyText1Blank);






    }
}
