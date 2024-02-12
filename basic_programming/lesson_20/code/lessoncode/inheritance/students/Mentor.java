package lesson_20.code.lessoncode.inheritance.students;

public class Mentor extends SeniorDeveloper{
    @Override
    void mentoring() {
        System.out.println("SUPER MENTORING");
    }


    @Override
    void debug() {
        System.out.println("SUPER QUICK DEBUG");
    }
}
