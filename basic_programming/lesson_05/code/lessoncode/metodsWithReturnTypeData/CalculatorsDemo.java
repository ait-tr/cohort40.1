package lesson_05.code.lessoncode.metodsWithReturnTypeData;

public class CalculatorsDemo {
    public static void main(String[] args) {
        CalculatorVoid calculatorVoid = new CalculatorVoid();
        calculatorVoid.sum(5,7);
        System.out.println("Результат работы метода : " + calculatorVoid.result);


        // ----- Используем метод, который будет ВОЗВРАЩАТЬ значение результата своей работы -----

        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();

        int x = 10;
        int y = 12;

        int resultFromMethod = calculatorWithReturnResult.sum(x,y);

        System.out.println("Результат сложения x = " + x + " и у = " + y + " будет равен: " + resultFromMethod);

    }
}
