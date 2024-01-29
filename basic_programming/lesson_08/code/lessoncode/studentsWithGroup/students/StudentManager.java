package lesson_08.code.lessoncode.studentsWithGroup.students;

import lesson_06.code.lessoncode.scanner.UserInput;

public class StudentManager {


    private UserInput ui = new UserInput();

    public Group createGroup() {
        String groupName = ui.inputText("Название группы: ");
        String startDate = ui.inputText("Дата начала обучения: ");
        int studentCount = ui.inputInteger("Количество студентов в группе: ");

        return new Group(groupName, startDate, studentCount);
    }

    public Student createStudent(Group group) {
        String lastName = ui.inputText("Фамилия: ");
        String firstName = ui.inputText("Имя: ");
        String studentCardNumber = ui.inputText("Номер студенческого: ");

        return new Student(lastName, firstName, studentCardNumber, group);
    }
}