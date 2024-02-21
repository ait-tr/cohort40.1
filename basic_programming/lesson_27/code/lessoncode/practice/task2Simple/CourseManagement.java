package lesson_27.code.lessoncode.practice.task2Simple;

import java.util.ArrayList;

public class CourseManagement {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("T1", "teacher 1");
        Teacher teacher2 = new Teacher("T2", "teacher 2");

        Course course1 = new Course("Course1", "course # 1", teacher1);
        Course course2 = new Course("Course2", "course # 2", teacher2);
        Course course3 = new Course("Course3", "course # 3", teacher2);
        Course course4 = new Course("Course4", "course # 4", teacher1);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        // создать коллекцию курсов для каждого преподавателя

        ArrayList<Course> coursesForTeacher1 = new ArrayList<>();
        for (Course course : courses){
            if (course.getTeacher().getName().equals(teacher1.getName())){
               coursesForTeacher1.add(course);
            }
        }


        ArrayList<Course> coursesForTeacher2 = new ArrayList<>();
        for (Course course : courses){
            if (course.getTeacher().getName().equals(teacher2.getName())){
                coursesForTeacher2.add(course);
            }
        }




        Student student1 = new Student("S1", "Student 1");
        Student student2 = new Student("S2", "Student 2");
        Student student3 = new Student("S3", "Student 3");
        Student student4 = new Student("S4", "Student 4");
        Student student5 = new Student("S5", "Student 5");
        Student student6 = new Student("S6", "Student 6");
        Student student7 = new Student("S7", "Student 7");

        course1.addStudent(student1);
        course2.addStudent(student2);
        course2.addStudent(student3);
        course1.addStudent(student4);
        course2.addStudent(student5);
        course1.addStudent(student6);
        course1.addStudent(student7);


        System.out.println("Студенты, записанные на " + course1.getName() + " :");
        for (Student student : course1.getStudents()){
            System.out.println(student.getName());
        }

        System.out.println("Студенты, записанные на " + course2.getName() + " :");
        for (Student student : course2.getStudents()){
            System.out.println(student.getName());
        }

        System.out.println("Курсы, которые ведет " + teacher1.getName() + " : ");
        System.out.println(coursesForTeacher1);
//        for (Course course : courses){
//            if (course.getTeacher().getName().equals(teacher1.getName())){
//                System.out.println(course.getName());
//            }
//        }

        System.out.println("Курсы, которые ведет " + teacher2.getName() + " : ");
        System.out.println(coursesForTeacher2);

//        for (Course course : courses){
//            if (course.getTeacher().getName().equals(teacher2.getName())){
//                System.out.println(course.getName());
//            }
//        }

    }
}
