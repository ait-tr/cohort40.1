package lesson_08.code.lessoncode.studentsWithGroup.students;

public class Student {

    private String lastName;
    private String firstName;
    private String studentCardNumber;
    private Group group;

    public Student(String lastName, String firstName, String studentCardNumber, Group group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentCardNumber = studentCardNumber;
        this.group = group;
    }

    public void printStudentInfo(){
        System.out.println("Имя студента: " + firstName);
        System.out.println("Фамилия студента: " + lastName);
        System.out.println("Номер билета студента: " + studentCardNumber);
        System.out.println("Группа студента: " + group);
    }
}
