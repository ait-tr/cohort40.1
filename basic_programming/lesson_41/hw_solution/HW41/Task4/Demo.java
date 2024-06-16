package code.HW41.Task4;





import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Students> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Students("Danny", 2000, 4.8));
        studentArrayList.add(new Students("Anton", 2000, 4.5));
        studentArrayList.add(new Students("Denis", 1987, 4.9));
        studentArrayList.add(new Students("Kate", 2020, 4.2));
        studentArrayList.add(new Students("Wicky", 2001, 5.0));
        studentArrayList.add(new Students("Liam", 1966, 4.7));
        studentArrayList.add(new Students("Sam", 1999, 4.6));
        studentArrayList.add(new Students("Kim", 2007, 5.0));

        List<Students> sortedStudents = studentArrayList.stream()
                .filter(student -> student.getGrades() == 5.0)
                .sorted()
                .toList();
        sortedStudents.forEach(student -> System.out.println(
                "Name: " + student.getName() +
                "\nYear of admission: " + student.getYear() +
                "\nGrades: " + student.getGrades() +
                "\n+++++++++++++++++++++++++++++++++"));

    }
}
