package lesson_30.code.lessoncode.compareObj;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonCompareDemo {
    public static void main(String[] args) {
       // PersonComparatorFirst personComparator = new PersonComparatorFirst();

        Comparator<Person> personComparator = new PersonComparatorThird().thenComparing(new PersonComparatorSecond());

        Set<Person> personSet = new TreeSet<>(personComparator);

        personSet.add(new Person("Tom", 25));
        personSet.add(new Person("Nick", 35));
        personSet.add(new Person("James", 49));
        personSet.add(new Person("Bill", 18));
        personSet.add(new Person("Alice", 18));

        System.out.println(personSet);
    }
}
