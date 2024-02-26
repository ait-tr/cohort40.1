package lesson_30.code.lessoncode.compareObj;

import java.util.Comparator;

public class PersonComparatorSecond implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
