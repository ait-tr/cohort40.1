package students;

import scanner.UserInput;

import java.util.Scanner;

public class StudentManager {


    public Student createStudent() {

        UserInput ui = new UserInput();

        String lastName = ui.inputText("Фамилия: ");
        String firstName = ui.inputText("Имя: ");
        String studentCardNumber = ui.inputText("Номер студенческого: ");
        String group = ui.inputText("Группа: ");

        return new Student(lastName, firstName,studentCardNumber,group);
    }

}
