package lesson_08.code.lessoncode.students;

public class StudentsGroup {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println("Введите информацию о первом студенте: ");
        Student student1 = manager.createStudent();

        System.out.println("Введите информацию о втором студенте: ");
        Student student2 = manager.createStudent();

        System.out.println("Введите информацию о третьем студенте: ");
        Student student3 = manager.createStudent();

        System.out.println("Информация о студентах:");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
