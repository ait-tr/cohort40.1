package lesson_27.code.lessoncode.practice.task2Simple.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Course {

    private String courseId;
    private String name;
    private Teacher teacher;
    private LinkedList<Student> students;

    public Course(String courseId, String name, Teacher teacher) {
        this.courseId = courseId;
        this.name = name;
        this.teacher = teacher;
        this.students = new LinkedList<>();
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
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
