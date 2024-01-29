package consultation.cons_01.consultationCode.calculator;

public class CalculatorWithReturnResult {

    public int sum(int a, int b){
        int result = a + b;
        return result;
    }

// добавить три метода которые бы возвращали результат вычитания, умножения и деления
    // и использовать их


    public int sub(int a, int b){
        int result = a - b;
        return result;
    }

    public int multiplication(int a, int b){
        int result = a * b;
        return result;
    }

    public double div(int a, int b){
        double result = (double) a / b;
        return result;
    }
}
