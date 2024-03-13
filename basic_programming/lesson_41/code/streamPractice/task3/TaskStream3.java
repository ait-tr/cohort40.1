package lesson_41.code.streamPractice.task3;

import java.util.ArrayList;
import java.util.List;

public class TaskStream3 {
    /*
- найти сотрудников которые не CEO

     */

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Thomas", "Manager", 800.5));
        employees.add(new Employee("Thea", "CEO", 2000));
        employees.add(new Employee("Mary", "Manager", 700));
        employees.add(new Employee("John", "Developer", 1200));


    }
}
