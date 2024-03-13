package lesson_41.code.streamPractice.task3;

public class Employee {
    private String name;
    private String staff;
    private double salary;

    public Employee(String name, String staff, double salary) {
        this.name = name;
        this.staff = staff;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getStaff() {
        return staff;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", staff='" + staff + '\'' +
                ", salary=" + salary +
                '}';
    }
}
