package lesson_19.code.lessoncode.incapsulation.hr;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Employee;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.DepartmentRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.EmployeeRepository;

public class HrApp {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository(10);
        DepartmentRepository departmentRepository = new DepartmentRepository(3);
        ApplicantRepository applicantRepository = new ApplicantRepository();
    }
}
