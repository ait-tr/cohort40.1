package lesson_30.code.lessoncode.treeSet;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public int compareTo(Cat catForCompare) {

        int compareResult = (-1) * name.compareTo(catForCompare.getName());

        if (compareResult == 0) {
            compareResult = catForCompare.age - age;
        }

        if (compareResult == 0) {
            compareResult = color.compareTo(catForCompare.color);
        }

        return compareResult;
    }
}
