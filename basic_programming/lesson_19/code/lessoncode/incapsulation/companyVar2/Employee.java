package lesson_19.code.lessoncode.incapsulation.companyVar2;

/*
Задание - создать приложение, которое будет осуществлять учет сотрудников
из разных отделов
 */


public class Employee {
    private int id;
    private String name;
    private Department department;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
