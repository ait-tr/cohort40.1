package lesson_35.code.lessoncode.optional;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {

    private Map<Long, Person> persons;

    public PersonRepository() {
        this.persons = new HashMap<>();
    }

    public void addPerson (long key, Person person){
        persons.put(key, person);
    }

    public Person findById(Long id){
        return persons.get(id);
    }
}
