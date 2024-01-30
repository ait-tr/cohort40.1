package lesson_11.code.lessoncode.variableAreaVisible;

import lesson_06.code.lessoncode.scanner.UserInput;

public class ifStatementExample {
    public static void main(String[] args) {


        String text;

        UserInput userInput = new UserInput();

        if (userInput.inputInteger("Please enter number:") > 0 ) {

             text = "Положительное число";

        } else {
             text = "отрицательное число";
        }

        System.out.println(text);


    }
}
