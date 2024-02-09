package lesson_19.code.lessoncode.incapsulation.hr.service;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Employee;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.DepartmentRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.EmployeeRepository;

public class DepartmentService {

    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public void createDepartments(){

        Department[] ourDepartments = departmentRepository.getDepartments();

        ourDepartments[0] = new Department("Marketing",2);
        ourDepartments[1] = new Department("IT",1);
        ourDepartments[2] = new Department("Accounting",1);
        ourDepartments[3] = new Department("Management",2);


    }



}
