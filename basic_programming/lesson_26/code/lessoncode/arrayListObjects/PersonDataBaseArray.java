package lesson_26.code.lessoncode.arrayListObjects;

import java.util.ArrayList;

public class PersonDataBaseArray {
    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Ruslan", 29, 134512514));
        personArrayList.add(new Person("Petr", 31, 364734734));
        personArrayList.add(new Person("Victor", 39, 2356326));
        personArrayList.add(new Person("Vladislav", 25, 5748548));
        personArrayList.add(new Person("Alex", 42, 2356236));
        personArrayList.add(new Person("John", 55, 845845));
        personArrayList.add(new Person("Olga", 16, 947845));
        personArrayList.add(new Person("Alina", 18, 542562));

        for (int i = 0; i < personArrayList.size(); i++) {
            Person currentPerson = personArrayList.get(i);
            currentPerson.say();
            String currentPersonName = currentPerson.getName();
            String currentPersonNewName = currentPersonName + " super HERO!";
            currentPerson.setName(currentPersonNewName);
            currentPerson.say();
        }

    }
}
