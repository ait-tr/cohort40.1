package lesson_19.code.lessoncode.incapsulation.hr.service;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Employee;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Person;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.EmployeeRepository;

public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addNewEmployee(String applicantName){

        ApplicantRepository applicantRepository = new ApplicantRepository();

        Applicant applicant = applicantRepository.findByName(applicantName);

        UserInput userInput = new UserInput();
        int newEmployeeId = userInput.inputInteger("Введите номер нового сотрудника: ");
        String newEmployeePosition = userInput.inputText("Введите должность нового сотрудника: ");
        int newEmployeeSalary = userInput.inputInteger("Введите зарплату нового сотрудника: ");

        Employee newEmployee = new Employee(
                newEmployeeId,
                applicant.getPerson(),
                applicant.getDepartment(),
                newEmployeePosition,
                newEmployeeSalary
        );

        employeeRepository.add(newEmployee);

    }



}
