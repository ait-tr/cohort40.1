package lesson_28.code.lessoncode.practice.var2;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Employee> employees; // Список сотрудников в отделе

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
