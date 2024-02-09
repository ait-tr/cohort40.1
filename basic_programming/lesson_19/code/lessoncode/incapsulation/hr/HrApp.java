package lesson_19.code.lessoncode.incapsulation.hr;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.DepartmentRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.EmployeeRepository;
import lesson_19.code.lessoncode.incapsulation.hr.service.ApplicantService;
import lesson_19.code.lessoncode.incapsulation.hr.service.DepartmentService;
import lesson_19.code.lessoncode.incapsulation.hr.service.EmployeeService;

public class HrApp {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository(10);
        DepartmentRepository departmentRepository = new DepartmentRepository(4);
        ApplicantRepository applicantRepository = new ApplicantRepository();

        ApplicantService applicantService = new ApplicantService(applicantRepository);
        EmployeeService employeeService = new EmployeeService(employeeRepository);
        DepartmentService departmentService = new DepartmentService(departmentRepository);

        departmentService.createDepartments();
//        System.out.println(departmentRepository);
//
//        System.out.println(employeeRepository);
//        System.out.println(applicantRepository);

        Department[] departments = departmentRepository.getDepartments();

        applicantService.addNewApplicant(departments[0]);
        System.out.println(applicantRepository);

    }
}
