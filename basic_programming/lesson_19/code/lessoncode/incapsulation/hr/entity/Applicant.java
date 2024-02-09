package lesson_19.code.lessoncode.incapsulation.hr.entity;

public class Applicant {

    private int id;
    private Person person;
    private Department department;
    private boolean isAgree;

    public Applicant(int id, Person person, Department department) {
        this.id = id;
        this.person = person;
        this.department = department;
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

    public boolean isAgree() {
        return isAgree;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", person=" + person +
                ", department=" + department +
                ", isAgree=" + isAgree +
                '}';
    }
}
