package lesson_43.code.junit;

public class CalculatorHandMadeTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int x = 10;
        int y = 15;

        int expectedResult = 25;
        int actualResult = calculator.sum(x,y);

        //-------------

        if (actualResult == expectedResult) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Test FAILED!!!");
            System.out.println("Expected: " + expectedResult + ", but received: " + actualResult);
        }
    }
}
