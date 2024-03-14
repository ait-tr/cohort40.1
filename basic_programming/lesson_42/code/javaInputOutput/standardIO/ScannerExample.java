package lesson_42.code.javaInputOutput.standardIO;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        double number1 = scanner.nextDouble();
        System.out.println("Ваше число: " + number1);


        System.out.println("Введите число как 'текст'");
        String doubleAsText = scanner.next();

        System.out.println("Ваше число как тест : " + doubleAsText);

        Double doubleAsDouble = Double.parseDouble(doubleAsText);

        System.out.println("Ваше число как число: " + doubleAsDouble);


    }
}
