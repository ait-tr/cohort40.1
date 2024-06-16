package code.HW41.Task6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Person> personsList = new ArrayList<>();
        Person person1 = new Person("Ray", 19);
        person1.addLanguage("Java");
        person1.addLanguage("Python");

        Person person2 = new Person("Lucia", 39);
        person2.addLanguage("PHP");
        person2.addLanguage("Python");

        Person person3 = new Person("Wahab", 43);
        person3.addLanguage("C++");
        person3.addLanguage("Accembler");

        personsList.add(person1);
        personsList.add(person2);
        personsList.add(person3);
        for (Person person: personsList){
            System.out.println(person.toString());
        }

        ArrayList<String> programmerLanguagesUnder25 = personsList.stream()
                .filter(person -> person.getAge() > 25)
                .flatMap(person -> person.getProgrammingLanguages().stream())
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(programmerLanguagesUnder25);
        }

}
