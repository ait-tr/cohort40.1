package lesson_43.code.javaInputOutput.standardIO;

import java.util.Scanner;

public class StandardIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение числа");

        int x = scanner.nextInt();

        if (x >= 0) {
            System.out.println("Стандартный вывод на консоль: " + x);
        } else {
            System.err.println("Сообщение об ошибке! Число отрицательное");
        }
    }
}
