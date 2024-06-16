package code.HW41.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jack", 17, 4.6));
        students.add(new Student("Amber", 20, 4.1));
        students.add(new Student("Omar", 14, 3.7));
        students.add(new Student("David", 27, 5.0));

        List<Student> sortedStudents = students.stream()
                .filter(student -> student.getAvgGrade() > 4.5)
                .sorted()
                .toList();


        sortedStudents.forEach(student -> System.out.println("Name: " + student.getName() +
                "\nAge: "+ student.getAge() +
                "\nAverage Grades: "+ student.getAvgGrade() +
                "\n***************************+*************"));
        System.out.println();
    }
}
