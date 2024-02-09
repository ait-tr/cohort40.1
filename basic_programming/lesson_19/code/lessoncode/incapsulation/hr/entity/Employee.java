package lesson_19.code.lessoncode.incapsulation.hr.entity;

public class Employee {

    private int id;
    private Person person;
    private Department department;
    private String position;
    private int salary;

    public Employee(int id, Person person, Department department, String position, int salary) {
        this.id = id;
        this.person = person;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Department getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", person=" + person +
                ", department=" + department +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
