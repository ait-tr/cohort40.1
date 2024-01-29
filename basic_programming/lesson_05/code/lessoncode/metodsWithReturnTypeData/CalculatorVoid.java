package lesson_05.code.lessoncode.metodsWithReturnTypeData;

public class CalculatorVoid {

    int result;

    public void sum(int a, int b){
        result = a + b;
        System.out.println("Результат сложения x = " + a + " и у = " + b + " будет равен: " + result);
    }
}
