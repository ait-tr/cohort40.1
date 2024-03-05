package lesson_36.code.lessoncode.pecs;


public class ZooUtil {

    Zoo<Animal> animalZoo = new Zoo<>(new Animal());
    Zoo<Cat> catZoo = new Zoo<>(new Cat());
    Zoo<Dog> dogZoo = new Zoo<>(new Dog());
    Zoo<DogSmall> dogSmallZoo = new Zoo<>(new DogSmall());

    void printZoo(Zoo<? extends Animal> zoo) {
        Animal item = zoo.getItem();
        System.out.println(item);
    }

    void addZooDog(Zoo<? super DogSmall> zoo) {
        zoo.setItem(new DogSmall());
    }


}
