package lesson_41.code.exception;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int number = Integer.parseInt(scanner.nextLine());

            System.out.println(number + " is a " + (99 % number == 0) + " factor of 99");

        } catch (NumberFormatException e) {
            System.out.println("Wrong data format!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception type: " + e.getMessage());
        }

        System.out.println("Program is finish!");


    }
}
