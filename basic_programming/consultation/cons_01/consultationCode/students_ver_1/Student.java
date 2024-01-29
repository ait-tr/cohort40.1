package consultation.cons_01.consultationCode.students_ver_1;


public class Student {
    String surName;
    String firstName;
    double averageGrade;

    public Student(String surName, String firstName, double averageGrade) {
        this.surName = surName;
        this.firstName = firstName;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
