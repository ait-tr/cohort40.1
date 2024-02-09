package lesson_19.code.lessoncode.incapsulation.companyVar2;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Department[] departments = new Department[4];

        departments[0] = new Department("Marketing");
        departments[1] = new Department("IT");
        departments[2] = new Department("Accounting");
        departments[3] = new Department("Management");

        employees[0] = new Employee(1, "Ruslan");
        employees[1] = new Employee(2, "Oleg");
        employees[2] = new Employee(3, "Roman");
        employees[3] = new Employee(4, "Olga");
        employees[4] = new Employee(5, "Vlad");

        employees[0].setDepartment(departments[0]);
        employees[1].setDepartment(departments[0]);
        employees[2].setDepartment(departments[1]);
        employees[3].setDepartment(departments[2]);
        employees[4].setDepartment(departments[3]);


        departments[0].getEmployees()[0] = employees[0];

//        Employee[] currentEmployees = departments[0].getEmployees();
//        currentEmployees[0] = employees[0];
//
        departments[0].getEmployees()[1] = employees[1];
        departments[1].getEmployees()[0] = employees[2];
        departments[2].getEmployees()[0] = employees[3];
        departments[3].getEmployees()[0] = employees[4];

        System.out.println("Список сотрудников");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: ");
            System.out.println("Имя: " + employees[i].getName());
            System.out.println("Отдел: " + employees[i].getDepartment().getName());

        }


        System.out.println();
        System.out.println("Список по департаментам");

        for (int i = 0; i < departments.length; i++) {
            System.out.println("Департамент: ");
            System.out.println("Название: " + departments[i].getName());

            for (int j = 0; j < departments[i].getEmployees().length; j++) {
                if (departments[i].getEmployees()[j] != null) {
                System.out.println("Имя сотрудника: " + departments[i].getEmployees()[j].getName());}
            }

        }
    }
}
