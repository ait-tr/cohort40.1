package consultation.cons_04.consultationCode.code;

public class Factorial {

    public int factorial(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
