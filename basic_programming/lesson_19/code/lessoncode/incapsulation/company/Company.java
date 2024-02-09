package lesson_19.code.lessoncode.incapsulation.company;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Ruslan", "Marketing");
        employees[1] = new Employee(2, "Oleg", "Marketing");
        employees[2] = new Employee(3, "Roman", "IT");
        employees[3] = new Employee(4, "Olga", "Accounting");
        employees[4] = new Employee(5, "Vlad", "Management");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: ");
            System.out.println("Имя: " + employees[i].getName());
            System.out.println("Отдел: " + employees[i].getDepartment());

        }

        employees[1].setDepartment("Management");

        System.out.println(" ------- после перевода сотрудника в другой отдел ------");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: ");
            System.out.println("Имя: " + employees[i].getName());
            System.out.println("Отдел: " + employees[i].getDepartment());

        }

        employees[2] = new Employee(6, "Sergey","IT");

        System.out.println(" ------- после найма нового сотрудника ------");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: ");
            System.out.println("Имя: " + employees[i].getName());
            System.out.println("Отдел: " + employees[i].getDepartment());

        }


        // ??? как мне найти всех сотрудников из отдела IT????

    }
}
