package metodsWithReturnTypeData;

public class CalculatorVoid {

    int result;

    public void sum(int x, int y){
        result = x + y;
        System.out.println("Результат сложения x = " + x + " и у = " + y + " будет равен: " + result);
    }
}
