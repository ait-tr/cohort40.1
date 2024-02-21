package lesson_27.code.lessoncode.practice.task2;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String teacherId;
    private String name;
    private List<Course> courses;

    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
        this.courses = new ArrayList<>();

    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
