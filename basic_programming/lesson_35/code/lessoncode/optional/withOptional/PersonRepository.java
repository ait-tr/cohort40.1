package lesson_35.code.lessoncode.optional.withOptional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    private Map<Long, Person> persons;

    public PersonRepository() {
        this.persons = new HashMap<>();
    }

    public void addPerson (long key, Person person){
        persons.put(key, person);
    }

    public Optional<Person> findById(Long id){
        return Optional.ofNullable(persons.get(id));
    }
}
