package lesson_09.code.lessoncode.switchExample;


import lesson_06.code.lessoncode.scanner.UserInput;

public class SwitchExample {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        String word = ui.inputText("Please enter any english word: ");

        switch (word) {
            case "coffee":
                System.out.println("Перевод этого слова: КОФЕ");
                break;

            case "tea":
                System.out.println("Перевод этого слова: ЧАЙ");
                //break;

            case "hello":
                System.out.println("Перевод этого слова: ПРИВЕТ");
                break;

            default:
                System.out.println("Этого я еще не знаю (((");

        }


    }
}
