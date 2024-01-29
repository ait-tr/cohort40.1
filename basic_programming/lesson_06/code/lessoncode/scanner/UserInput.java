package lesson_06.code.lessoncode.scanner;

import java.util.Scanner;

public class UserInput {

    public String inputText(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }
    public int inputInteger(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        int inputInteger = scanner.nextInt();
        return inputInteger;
    }
    public double inputDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Double inputDouble = scanner.nextDouble();
        return inputDouble;
    }

}
