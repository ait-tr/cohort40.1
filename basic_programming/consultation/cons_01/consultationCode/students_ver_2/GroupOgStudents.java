package consultation.cons_01.consultationCode.students_ver_2;


public class GroupOgStudents {
    public static void main(String[] args) {
        Student student1 = new Student("Petrova", "Olga");
        Student student2 = new Student("Smith", "John");
        Student student3 = new Student("Koval", "Ruslan");
        Student student4 = new Student("Smith", "Tatiana");
        Student student5 = new Student("Rubenshtain", "Serge");


        student1.addAverageGrade(4.5);
        student2.addAverageGrade(4.2);
        student3.addAverageGrade(4.7);
        student4.addAverageGrade(4.9);
        student5.addAverageGrade(4.4);


        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
        student4.printStudent();
        student5.printStudent();


    }
}
