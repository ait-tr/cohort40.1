package lesson_41.code.streamPractice.extraTask;


import java.util.*;
import java.util.stream.Collectors;

public class ExtraTaskStream {
    /*
1. Создать класс Employee - имя, должность, название департамента и зарплата (от 800 до 2000)
2. Сгруппировать сотрудников по должности
3. Вычислить среднюю зарплату всех сотрудников
4. Получить список сотрудников с зп > 1000
5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
6. Получить сотрудников с самой низкой зп
7. Получите сотрудников из всех отделов с максимальной зп

     */

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Manager", "Marketing", 1500);
        Employee emp2 = new Employee("Bob", "Clerk", "HR", 800);
        Employee emp3 = new Employee("Alice", "Engineer", "IT", 2000);
        Employee emp4 = new Employee("Eva", "Manager", "Finance", 2000);
        Employee emp5 = new Employee("Charlie", "Developer", "Marketing", 1700);

        List<Employee> employees = Arrays.asList(
                emp1, emp2, emp3, emp4, emp5
        );

        // 2. Сгруппировать сотрудников по должности
        Map<String, List<Employee>> employeesByPosition = employees.stream()
                .collect(Collectors.groupingBy(Employee::getPosition));
        System.out.println("Employees grouped by position: " + employeesByPosition);

        // 3. Вычислить среднюю зарплату всех сотрудников
        Double averageSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary: " + averageSalary);

        // 4. Получить список сотрудников с зп > 1000
        List<Employee> employeesWithHighSalary = employees.stream()
                .filter(e -> e.getSalary() > 1000)
                .collect(Collectors.toList());
        System.out.println("Employees with salary > 1000: " + employeesWithHighSalary);

        // 5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        employees.stream()
                .filter(e -> "Marketing".equals(e.getDepartment()))
                .forEach(e -> e.setSalary(Math.round(e.getSalary() * 1.15)));
        System.out.println("Employees in marketing after raise: " + employees);

        // 6. Получить сотрудников с самой низкой зп
        Optional<Employee> employeeWithLowestSalary = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employee with the lowest salary: " + employeeWithLowestSalary);

        // 7. Получить сотрудников из всех отделов с максимальной зп
        double maxSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElseThrow(NoSuchElementException::new);

        List<Employee> employeesWithMaxSalary = employees.stream()
                .filter(e -> e.getSalary() == maxSalary)
                .collect(Collectors.toList());

        System.out.println("Employee(s) with the max salary: " + employeesWithMaxSalary);


    }
}
