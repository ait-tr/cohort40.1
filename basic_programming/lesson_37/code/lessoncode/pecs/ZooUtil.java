package lesson_37.code.lessoncode.pecs;


import lesson_36.code.lessoncode.pecs.Animal;
import lesson_36.code.lessoncode.pecs.Cat;
import lesson_36.code.lessoncode.pecs.Dog;
import lesson_36.code.lessoncode.pecs.DogSmall;
import lesson_36.code.lessoncode.pecs.Zoo;

public class ZooUtil {

    lesson_36.code.lessoncode.pecs.Zoo<lesson_36.code.lessoncode.pecs.Animal> animalZoo = new lesson_36.code.lessoncode.pecs.Zoo<>(new lesson_36.code.lessoncode.pecs.Animal());
    lesson_36.code.lessoncode.pecs.Zoo<lesson_36.code.lessoncode.pecs.Cat> catZoo = new lesson_36.code.lessoncode.pecs.Zoo<>(new Cat());
    lesson_36.code.lessoncode.pecs.Zoo<lesson_36.code.lessoncode.pecs.Dog> dogZoo = new lesson_36.code.lessoncode.pecs.Zoo<>(new Dog());
    lesson_36.code.lessoncode.pecs.Zoo<DogSmall> dogSmallZoo = new lesson_36.code.lessoncode.pecs.Zoo<>(new DogSmall());

    void printZoo(lesson_36.code.lessoncode.pecs.Zoo<? extends lesson_36.code.lessoncode.pecs.Animal> zoo) {
        Animal item = zoo.getItem();
        System.out.println(item);
    }

    void addZooDog(Zoo<? super DogSmall> zoo) {
        zoo.setItem(new DogSmall());
    }


}
