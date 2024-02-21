package lesson_27.code.lessoncode.practice.task1;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        Department sales = new Department("Sales");
        Department accounting = new Department("Accounting");
        Department marketing = new Department("Marketing");

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(marketing);
        departments.add(sales);
        departments.add(0,accounting);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("001", "Ruslan", sales));
        employees.add(new Employee("002", "Olga", accounting));
        employees.add(new Employee("003", "Roman", marketing));
        employees.add(new Employee("004", "John", sales));
        employees.add(new Employee("005", "Bill", marketing));
        employees.add(new Employee("006", "Gunter", sales));
        employees.add(new Employee("007", "James", accounting));
        employees.add(new Employee("008", "Ostap", marketing));


        for (int i = 0; i < employees.size(); i++) {
            Employee currentEmployee = employees.get(i);
            System.out.println(currentEmployee.getName() + " работает в отделе : " + currentEmployee.getDepartment().getDepartmentName());
        }

        System.out.println("=================");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee.getName() + " работает в отделе : " + currentEmployee.getDepartment().getDepartmentName());

        }

        System.out.println(employees);

    }
}
