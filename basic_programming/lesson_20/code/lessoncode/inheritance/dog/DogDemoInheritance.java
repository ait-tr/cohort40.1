package lesson_20.code.lessoncode.inheritance.dog;

public class DogDemoInheritance {
    public static void main(String[] args) {

        BigDog bigDog = new BigDog("Zeus", "Cane Corso", false);

        SmallDog smallDog = new SmallDog("Gera", "Shiatsu", true);


        System.out.println(bigDog.getName());
        System.out.println(bigDog.getBreed());
        System.out.println(bigDog.isProtectDiploma());
        bigDog.voice("Наша собака громко лает");

        System.out.println(smallDog.getName());
        System.out.println(smallDog.getBreed());
        System.out.println(smallDog.isVisitGroomer());
        bigDog.voice("Наша собака зовет на помощь");


        BigDog[] bigDogs = new BigDog[2];
        SmallDog[] smallDogs = new SmallDog[3];

        Dog[] dogs = new Dog[2];

        dogs[0] = bigDog;
        dogs[1] = smallDog;

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].voice("Собака " + dogs[i].getName());
        }


    }
}
