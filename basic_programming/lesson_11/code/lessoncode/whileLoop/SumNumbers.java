package lesson_11.code.lessoncode.whileLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean condition = true;

        System.out.println("Please enter integer number (negative number for exit");

        while (condition) {
            int number = scanner.nextInt();

            if (number >= 0) {
                 sum = sum + number;
            } else {
                condition = false;
            }
        }

        System.out.println("Sum all numbers is: " + sum);
    }
}
