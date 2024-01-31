package consultation.cons_04.consultationCode.code;

public class Task3Factorial {
    /*
    Написать метод для вычисления факториала числа
    (произведение всех чисел от 1 до заданного)

    метод должен получать число - int
    метод должен возвращать - число int

    1 ................ n

    factorial = 1

    в цикле пройтись i = > от 1 до n
    и в factorial = factorial * i;

для n = 3

factorial = 1
i = 1
factorial= 1 * 1 => 1;

i = 2
factorial= 1 * 2 => 2;

i = 3
factorial= 2 * 3 => 6;

     */

    public static void main(String[] args) {

        Factorial factCalc = new Factorial();

        int n = 10;

        System.out.println("Значение факториала для числа " + n + " равно " + factCalc.factorial(n));


    }
}
