package lesson_23.code.lessoncode.zoo;

public class Reptile extends Animal implements Walkable{

    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(getName() + "says: I'm a reptile");
    }


    @Override
    public void walk() {
        System.out.println(getName() + " is walking");
    }
}
