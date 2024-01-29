package lesson_06.code.lessoncode.scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        String text = ui.inputText("Введите текст: ");

        System.out.println("Вы ввели: " + text);
    }
}
