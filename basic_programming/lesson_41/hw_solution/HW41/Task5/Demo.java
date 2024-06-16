package code.HW41.Task5;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<Integer, List<Students>> studentsByYear = studentArrayList.stream()
                .collect(Collectors.groupingBy(
                        Students::getYear,
                        Collectors.toList()
                ));
        studentsByYear.forEach((year, students) -> {
            System.out.println("Year : " + year);
            students.forEach(student -> System.out.println(
                    "Name: " + student.getName() +
                    "\nGrades: " + student.getGrades() +
                    "\n"));
        });
    }
}
