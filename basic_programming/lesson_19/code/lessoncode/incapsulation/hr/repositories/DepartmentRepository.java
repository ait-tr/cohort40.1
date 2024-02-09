package lesson_19.code.lessoncode.incapsulation.hr.repositories;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;

import java.util.Arrays;

public class DepartmentRepository {

    Department[] departments;

    public DepartmentRepository() {
        this.departments = new Department[3];
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
