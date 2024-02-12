package lesson_20.code.lessoncode.inheritance.dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Zeus", "Cane Corso");

        dog.voice("Наша собака громко лает на дверь");

        BigDog bigDog = new BigDog("Zeus", "Cane Corso", false);

        SmallDog smallDog = new SmallDog("Gera", "Shiatsu", true);


        Dog[] dogs = new Dog[5];

        BigDog[] bigDogs = new BigDog[3];
        SmallDog[] smallDogs = new SmallDog[2];



    }
}
