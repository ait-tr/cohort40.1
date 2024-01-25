package students;

import java.util.Scanner;

public class StudentManager {

    private Scanner scanner;

    public StudentManager() {
        this.scanner = new Scanner(System.in);
    }

    public Student createStudent() {
        System.out.println("Фамилия: ");
        String lastName = scanner.nextLine();
        System.out.println("Имя: ");
        String firstName = scanner.nextLine();
        System.out.println("Номер студенческого: ");
        String studentCardNumber = scanner.nextLine();
        System.out.println("Группа: ");
        String group = scanner.nextLine();

        return new Student(lastName, firstName,studentCardNumber,group);

    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
