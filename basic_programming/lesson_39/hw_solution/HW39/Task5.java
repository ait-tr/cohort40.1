package code.HW39;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        Integer number = scanner.nextInt();
        isPrimeNumber test = (n) -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(number + " is prime? " + test.prime(number));
    }
    @FunctionalInterface
    public interface isPrimeNumber{
        Boolean prime(Integer n);
    }

}
