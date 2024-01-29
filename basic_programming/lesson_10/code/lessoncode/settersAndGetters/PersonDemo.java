package lesson_10.code.lessoncode.settersAndGetters;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John","London","123-456-789");

        System.out.println(person1);


        Person person2 = new Person("James","007");

        System.out.println(person2);

        person2.setAddress("Skyfall");

        System.out.println(person2);


        String newAddress = "Glasgow";


        person1.setAddress(newAddress);

        System.out.println(person1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter new address:");
        newAddress = scanner.nextLine();

        person2.setAddress(newAddress);
        System.out.println(person2);





    }
}
