package lesson_30.code.lessoncode.treeSet;

public class Dog implements Comparable<Dog>{

    private String name;
    private Breed breed;

    public Dog(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }


    @Override
    public int compareTo(Dog anotherDog) {
        return breed.compareTo(anotherDog.getBreed());
    }
}
