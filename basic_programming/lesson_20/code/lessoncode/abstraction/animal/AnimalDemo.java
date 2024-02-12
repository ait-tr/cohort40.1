package lesson_20.code.lessoncode.abstraction.animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Fish firstAnimal = new Fish();
        Dog secondAnimal = new Dog();
        Worm thirdAnimal = new Worm();

        firstAnimal.breath();
        secondAnimal.breath();
        thirdAnimal.breath();

        System.out.println("===========");

        Animal[] animals = {firstAnimal,secondAnimal,thirdAnimal};

        for (int i = 0; i < animals.length; i++) {
            animals[i].breath();
        }

    }
}
