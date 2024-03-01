package lesson_34.code.lessoncode.differentCollections;

import java.util.HashMap;
import java.util.Map;

public class FastAccessByKey {
    public static void main(String[] args) {
        Map<String, Integer> ageOfPerson = new HashMap<>();

        ageOfPerson.put("Olga", 18);
        ageOfPerson.put("Roman",25);
        ageOfPerson.put("Ruslan", 28);
        ageOfPerson.put("Serg", 21);
        ageOfPerson.put("Elena", 32);
        ageOfPerson.put("Victor", 38);


        String name = "Elena";
        System.out.println(ageOfPerson.get(name));

    }
}
