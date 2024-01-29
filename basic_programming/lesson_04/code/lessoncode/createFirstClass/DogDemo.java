package lesson_04.code.lessoncode.createFirstClass;

public class DogDemo {
    public static void main(String[] args) {
        int ageDog1 = 3;
        double weightDog1 = 50.5;

        int ageDog2 = 2;
        double weightDog2 = 10.5;

        //System.out.println(ageDog1);

        Dog dog1 = new Dog();

        System.out.println(dog1);

        dog1.age = 4;
        dog1.weight = 62.3;

        System.out.println(dog1.age);
        System.out.println(dog1.weight);

        Dog dog2;

        dog2 = new Dog();

        Dog dog3 = new Dog();

        System.out.println(dog2.age);
        System.out.println(dog2.weight);
    }
}
