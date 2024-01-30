package lesson_11.code.lessoncode.whileLoop;

import lesson_06.code.lessoncode.scanner.UserInput;

public class Example3Cat {
    public static void main(String[] args) {
        /*
        Запросить в цикле у пользователя имя и породу кошки

        если пользователь ввел пустую строку в имени или породе то завершить

        если данные введены корректно то создать новую кошку и распечатать ее параметры
         */
        UserInput userInput = new UserInput();
        boolean condition = true;

        while (condition) {
            String catName = userInput.inputText("Please enter cat name: ");
            String catBreed = userInput.inputText("Please enter cat breed: ");

            if (catName.isEmpty() || catBreed.equals("")) {
                condition = false;
            } else {
                Cat cat = new Cat(catName,catBreed);
                System.out.println(cat);
            }
        }

        System.out.println("Цикл ввода данных о кошках завершен!");

    }
}
