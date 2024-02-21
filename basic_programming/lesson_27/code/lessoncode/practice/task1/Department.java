package lesson_27.code.lessoncode.practice.task1;

public class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }



    @Override
    public String toString() {
        return "Department{" +
                "name='" + departmentName + '\'' +
                '}';
    }
}
