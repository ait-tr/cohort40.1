package lesson_11.code.lessoncode.forLoop;

import lesson_06.code.lessoncode.scanner.UserInput;

public class Example2 {
    public static void main(String[] args) {
        /*
        дан текст
        вывести отдельно каждую букву этого текста
         */

        UserInput userInput = new UserInput();


        String text = userInput.inputText("Введите текст:");

//        char letter1 = text.charAt(0);
//        System.out.println(letter1);
//
//        char letter2 = text.charAt(1);
//        System.out.println(letter2);
//
//        char letter3 = text.charAt(2);
//        System.out.println(letter3);
//
//        char letter4 = text.charAt(3);
//        System.out.println(letter4);
//
//        char letter5 = text.charAt(4);
//        System.out.println(letter5);


        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            System.out.println("Буква в тексте с индексом " + i + " : " + currentChar);
        }


    }
}
