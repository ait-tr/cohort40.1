package lesson_41.code.streamPractice.task5;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Person maxAge(Person person1, Person person2) {
        return person1.getAge() > person2.getAge() ? person1 : person2;
    }
}
