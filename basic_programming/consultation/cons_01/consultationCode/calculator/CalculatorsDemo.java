package consultation.cons_01.consultationCode.calculator;

public class CalculatorsDemo {
    public static void main(String[] args) {

        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();

        int x = 10;
        int y = 12;

        int resultSum = calculatorWithReturnResult.sum(x,y);

        System.out.println("Результат сложения x = " + x + " и у = " + y + " будет равен: " + resultSum);

        System.out.println("Результат вычитания y = " + y + " из x = " + x + " будет равен: " + calculatorWithReturnResult.sub(x,y));

        System.out.println("Результат умножения x = " + x + " на у = " + y + " будет равен: " + calculatorWithReturnResult.multiplication(x,y));

        System.out.println("Результат деления x = " + x + " на у = " + y + " будет равен: " + calculatorWithReturnResult.div(x,y));


    }
}
