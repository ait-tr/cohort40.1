package lesson_35.code.lessoncode.optional;

public class PersonDemo {
    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();

        repository.addPerson(1, new Person("Bill"));
        repository.addPerson(5, new Person("James"));
        repository.addPerson(7, new Person("John"));
        repository.addPerson(10, new Person());


        //   System.out.println(repository.findById(1L));


        Person foundedPerson = repository.findById(10L);

        if (foundedPerson != null) {

            System.out.println(foundedPerson.name);

            if (foundedPerson.name != null) {
                System.out.println("длина имени = " + foundedPerson.name.length());

            } else {

                System.out.println("Пользователя с таким Id не найдено");
            }

        }
    }
}
