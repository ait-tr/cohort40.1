package lesson_24.code.lessoncode.arrays;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Ruslan");
        Employee employee2 = new Employee(2,"Oleg");
        Employee employee3 = new Employee(3,"Victor");
        Employee employee4 = new Employee(4,"Ekaterina");
        Employee employee5 = new Employee(5,"Alina");
        Employee employee6 = new Employee(6,"Ludmila");
        Employee employee7 = new Employee(7,"Anna");
        Employee employee8 = new Employee(8,"Evgeny");
        Employee employee9 = new Employee(9,"Natalia");
        Employee employee10 = new Employee(10,"Ilya");

        Employee[] employees = {
                employee1,employee2,
                employee3,employee4,
                employee5,employee6,
                employee7,employee8,
                employee9,employee10
        };


//        System.out.println(employees[0].name);
//        System.out.println(employees[1].name);
//        System.out.println(employees[2].name);
////...


        for (int i = 0; i < employees.length; i++) {
            System.out.print("Наш сотрудник: ");
            System.out.println(employees[i].name);
        }

    }
}
