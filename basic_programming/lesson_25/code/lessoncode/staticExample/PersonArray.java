package lesson_25.code.lessoncode.staticExample;

import java.util.Scanner;

public class PersonArray {

    public static Person[] createArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: " );
        int arraySize = scanner.nextInt();

        return new Person[arraySize];
    }

}
