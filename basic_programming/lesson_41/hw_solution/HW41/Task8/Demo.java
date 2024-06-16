package code.HW41.Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Demo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Denis", 45, false, 45000.0));
        personList.add(new Person("Anna", 25, true, 40000.0));
        personList.add(new Person("Anton", 35, false, 55000.0));
        personList.add(new Person("Ella", 19, true, 35000.0));
        personList.add(new Person("Trevor", 36, false, 65000.0));

        Double avarageMenFrom25To40 = personList.stream()
                .filter(person -> !person.getFemale())
                .filter(person -> person.getAge() >= 25 && person.getAge() <= 40)
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Avarage salary for men in 25 - 40 years is " + avarageMenFrom25To40);
    }
}
