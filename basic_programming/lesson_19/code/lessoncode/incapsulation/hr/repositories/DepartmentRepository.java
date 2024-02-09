package lesson_19.code.lessoncode.incapsulation.hr.repositories;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;

import java.util.Arrays;

public class DepartmentRepository {

    Department[] departments;

    public DepartmentRepository(int number) {
        this.departments = new Department[number];
    }

    public Department[] getDepartments() {
        return departments;
    }




    @Override
    public String toString() {
        return "DepartmentRepository{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}
