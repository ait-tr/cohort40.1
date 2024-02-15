package lesson_23.code.lessoncode.zoo;

public class Mammal extends Animal implements Walkable{

    private boolean isPredator;

    public Mammal(String name, int age, boolean isPredator) {
        super(name, age);
        this.isPredator = isPredator;
    }

    @Override
    void makeSound() {

        String predatorOrNot = isPredator ? "a predator" : "not a predator";

//        if (isPredator) {
//        predatorOrNot = "a predator";
//        }  else {
//        predatorOrNot ="not a predator";
//        }
//
        System.out.println(getName() + " says: I'm a mammal and " + predatorOrNot);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking");
    }
}
