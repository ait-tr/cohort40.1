package lesson_06.code.lessoncode.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter text message: ");
        String textMessage = scanner.nextLine();
        System.out.println("Your text is: " + textMessage);

        System.out.println("Please enter integer number: ");
        int intNumber = scanner.nextInt();

        System.out.println("Your number is: " + intNumber);

        System.out.println("Please enter double number: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println("Your number is: " + doubleNumber);


        scanner.close();
    }
}
