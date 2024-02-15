package lesson_23.code.lessoncode.zoo;

public class ZooArray {

    private Animal[] animals;

    public ZooArray(int animalCount) {
        this.animals = new Animal[animalCount];
    }


    public void createAllAnimals(){
        animals[0] = new Mammal("Elephant", 10, false);
        animals[1] = new Mammal("Tiger", 5, true);
        animals[2] = new Bird("Parrot", 15);
        animals[3] = new Bird("Eagle", 7);
        animals[4] = new Reptile("Crocodile", 25);

    }

    public void animalOperations(){

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();

            //System.out.println(animals[i].getClass());

            if (animals[i] instanceof Walkable) {
                ((Walkable) animals[i]).walk();
            }

            if (animals[i] instanceof Flyable) {
                ((Flyable) animals[i]).fly();
            }

        }
    }

}
