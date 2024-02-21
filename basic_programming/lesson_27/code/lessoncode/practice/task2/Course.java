package lesson_27.code.lessoncode.practice.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseId;
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String courseId, String name, Teacher teacher) {
        this.courseId = courseId;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        teacher.addCourse(this);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }




}
