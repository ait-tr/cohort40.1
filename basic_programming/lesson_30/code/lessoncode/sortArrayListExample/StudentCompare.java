package lesson_30.code.lessoncode.sortArrayListExample;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
//        if (student1.roll == student2.roll) return 0;
        if (student1.roll == student2.roll) return student1.name.compareTo(student2.name);
        if (student1.roll > student2.roll) return 1;
        else return -1;
    }
}
