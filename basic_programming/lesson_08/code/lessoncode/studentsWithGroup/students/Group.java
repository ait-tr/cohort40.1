package lesson_08.code.lessoncode.studentsWithGroup.students;

public class Group {
    private String name;
    private String startDate;
    private int studentCount;

    public Group(String name, String startDate, int studentCount) {
        this.name = name;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Группа: " + name + ", начало обучения: " + startDate + ", количество студентов: " + studentCount;
    }
}
