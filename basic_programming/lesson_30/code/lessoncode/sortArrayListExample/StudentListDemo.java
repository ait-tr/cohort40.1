package lesson_30.code.lessoncode.sortArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class StudentListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(45,"Paul"));
        students.add(new Student(11,"Pablo"));
        students.add(new Student(27,"Max"));
        students.add(new Student(27,"Alex"));

        System.out.println(students);

        students.sort(new StudentCompare());

        System.out.println(students);


    }
}
