package lesson_30.code.lessoncode.compareObj;

import java.util.Comparator;

public class PersonComparatorThird implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {

        return person1.getName().compareTo(person2.getName());
    }
}
