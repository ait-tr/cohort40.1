package consultation.cons_04.consultationCode.code.changeSpecSymbol;

import lesson_06.code.lessoncode.scanner.UserInput;

public class TextSpec {
    /*
    Требуется:

убрать все специальные символы, такие "(", ")", "@"
(методом replaceAll не пользоваться)

     */
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        String text = userInput.inputText("Введите тест с использованием специальных символов: ");

        // здесь будет осуществляться проверка и замена символов
        CheckAndChange checkAndChange = new CheckAndChange();

        String changedText = checkAndChange.change(text);

        // здесь будет вывод итого текст

        System.out.println("Измененный текст: " + changedText);
    }
}
