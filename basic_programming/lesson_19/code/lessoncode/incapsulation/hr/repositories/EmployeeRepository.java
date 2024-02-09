package lesson_19.code.lessoncode.incapsulation.hr.repositories;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Employee;

import java.util.Arrays;

public class EmployeeRepository {

    Employee[] employees;

    public EmployeeRepository() {
        this.employees = new Employee[10];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void add(Employee employee){}

    public Employee findByName(String name){
        return null;
    }


    @Override
    public String toString() {
        return "EmployeeRepository{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
