package lesson_41.code.streamPractice.task4;

import java.util.List;

public class Human {
    private String name;
    private List<String> phones;

    public Human(String name, List<String> phones) {
        this.name = name;
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return phones;
    }
}
