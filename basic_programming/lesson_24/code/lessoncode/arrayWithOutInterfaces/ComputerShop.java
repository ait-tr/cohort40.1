package lesson_24.code.lessoncode.arrayWithOutInterfaces;

import lesson_06.code.lessoncode.scanner.UserInput;

public class ComputerShop {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        Sklad sklad = new Sklad();

        SkladOperations skladOperations = new SkladOperations();

        skladOperations.operations(ui,sklad);

    }
}
