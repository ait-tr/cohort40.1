package lesson_19.code.lessoncode.incapsulation.companyVar2;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employees = new Employee[3];

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
