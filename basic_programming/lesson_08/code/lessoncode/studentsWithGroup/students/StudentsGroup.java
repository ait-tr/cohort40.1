package lesson_08.code.lessoncode.studentsWithGroup.students;

public class StudentsGroup {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println("Создание группы:");
        Group group = manager.createGroup();

        System.out.println("Добавление студентов в группу:");
        Student student1 = manager.createStudent(group);
        Student student2 = manager.createStudent(group);
        Student student3 = manager.createStudent(group);


        System.out.println("Информация о группе и студентах:");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
