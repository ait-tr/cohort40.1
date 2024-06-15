package code.HW39;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a whole number: ");
        Scanner scr = new Scanner(System.in);
        Integer number = scr.nextInt();
        System.out.println(calculateFactorial(number));

    }
    public static Integer calculateFactorial(int number){
        return code.HW39.Task4.factorial.factor(number);
    }

    static factorial factorial = (number) -> {
        if (number < 0){
            System.out.println("Error");
            return 0;
        }
        int total = 1;
        for (int i = 2; i <= number; i++) {
            total *= i;
        }
        return total;
    };

    @FunctionalInterface
    interface factorial{
        Integer factor(Integer number);

    }
}
