package lesson_19.code.lessoncode.incapsulation.hr.service;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson_19.code.lessoncode.incapsulation.hr.entity.Person;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;

public class ApplicantService {

    ApplicantRepository applicantRepository;

    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public void addNewApplicant(Department department){
        UserInput userInput = new UserInput();
        int newApplicantId = userInput.inputInteger("Введите номер соискателя: ");
        String newApplicantName = userInput.inputText("Введите имя соискателя: ");
        String newApplicantSpeciality = userInput.inputText("Введите специальность соискателя: ");

        Person newPerson = new Person(newApplicantName, newApplicantSpeciality);

        Applicant newApplicant = new Applicant(newApplicantId, newPerson,department);

        applicantRepository.add(newApplicant);

    }



}
