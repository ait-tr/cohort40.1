package lesson_15.code.lessoncode.hr;

import java.util.Arrays;

public class HrDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Victor");
        Person person2 = new Person("Vadim");
        Person person3 = new Person("Alex");
        Person person4 = new Person("Olga");
        Person person5 = new Person("Ruslan");


        Person[] personsForDep1 = {person1, person2};
        Person[] personsForDep2 = {person3, person4};


        Department department1 = new Department("Marketing", personsForDep1);
        Department department2 = new Department("Accounting", personsForDep2);

        Department[] departments = {department1,department2};

        Firm company = new Firm("SuperPuper", person5,departments);

        System.out.println(company.companyName);

        System.out.println("Список департаментов:");
        System.out.println(departments[0]);
        System.out.println(departments[1]);



    }
}
