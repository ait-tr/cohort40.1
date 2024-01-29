package lesson_04.code.lessoncode.createFirstClass;

public class DogDemo2 {
    public static void main(String[] args) {
        int ageDog1 = 3;

        int ageDog2 = ageDog1;

        ageDog2 = ageDog2 + 1;

        Dog dog1 = new Dog();

        Dog dog2 = new Dog();

        System.out.println(dog1);
        System.out.println(dog2);

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);


    }
}
