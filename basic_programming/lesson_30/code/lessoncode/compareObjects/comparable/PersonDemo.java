package lesson_30.code.lessoncode.compareObjects.comparable;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {
        Set<Person> ourTeam = new TreeSet<>();
        ourTeam.add(new Person("Johnatan", "Watson"));
        ourTeam.add(new Person("Zigmund", "Freid"));
        ourTeam.add(new Person("Boris", "Bekker"));
        ourTeam.add(new Person("John", "Watson"));
        ourTeam.add(new Person("Alex", "King"));
        ourTeam.add(new Person("Elena","Trojan"));
        ourTeam.add(new Person("Andrew","Lloyd"));

        for (Person person : ourTeam) {
            System.out.println("First Name: " + person.getFirstName() + ",  Second name: " + person.getSecondName());
        }
    }
}
