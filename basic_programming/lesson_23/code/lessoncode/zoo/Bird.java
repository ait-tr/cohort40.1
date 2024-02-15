package lesson_23.code.lessoncode.zoo;

public class Bird extends Animal implements Flyable{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(getName() + "says: I'm a bird");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
