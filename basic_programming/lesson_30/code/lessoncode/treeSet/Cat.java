package lesson_30.code.lessoncode.treeSet;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

    String name;
    int age;

    public Cat(String name, int age) {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Cat catForCompare) {

        int compareResult = name.compareTo(catForCompare.getName());

        if (compareResult == 0) {
            compareResult = age - catForCompare.age;
        }


        return compareResult;
    }
}
