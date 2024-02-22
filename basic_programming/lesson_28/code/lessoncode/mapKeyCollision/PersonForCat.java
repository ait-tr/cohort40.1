package lesson_28.code.lessoncode.mapKeyCollision;

import java.util.Objects;

public class PersonForCat {

    String name;

    public PersonForCat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonForCat that = (PersonForCat) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "PersonForCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
