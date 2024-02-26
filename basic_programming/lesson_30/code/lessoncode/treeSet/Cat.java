package lesson_30.code.lessoncode.treeSet;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Cat catForCompare) {

        int compareResult = name.compareTo(catForCompare.getName());

        return compareResult;
    }
}
