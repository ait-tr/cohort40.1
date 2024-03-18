package lesson_44.code.example3;

import lesson_06.code.lessoncode.scanner.UserInput;

public class Example2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();

        int x = ui.inputInteger("Введите x:");
        int y = ui.inputInteger("Введите y:");

        int result = calculator.sum(x,y);

        uo.printData(result);

    }
}
