package lesson_28.code.lessoncode.practice.var1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    public static void main(String[] args) {
        // Создаем коллекцию сотрудников
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Bill"));
        employees.add(new Employee(3, "Robert"));
        employees.add(new Employee(4, "Olga"));
        employees.add(new Employee(5, "Maria"));

        // Создаем отделы
        Department department1 = new Department("Development");
        Department department2 = new Department("Marketing");

        // Создаем коллекцию отделов и сотрудников в каждом отделе
        Map<Department, List<Employee>> departmentEmployees = new HashMap<>();
        departmentEmployees.put(department1, new ArrayList<>());
        departmentEmployees.put(department2, new ArrayList<>());

        // Распределяем сотрудников по отделам
        departmentEmployees.get(department1).add(employees.get(0));
        departmentEmployees.get(department1).add(employees.get(2));
        departmentEmployees.get(department2).add(employees.get(1));
        departmentEmployees.get(department2).add(employees.get(3));
        departmentEmployees.get(department2).add(employees.get(4));


        System.out.println(departmentEmployees);

        // Вывод информации о сотрудниках по отделам
//        for (Map.Entry<Department, List<Employee>> entry : departmentEmployees.entrySet()) {
//            System.out.println("Отдел: " + entry.getKey().getName());
//            for (Employee employee : entry.getValue()) {
//                System.out.println(employee);
//            }
//        }

        // Создаем коллекцию всех отделов
        List<Department> departments = new ArrayList<>(departmentEmployees.keySet());

        // Вывод всех отделов
        System.out.println("Все отделы:");
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
