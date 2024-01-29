package consultation.cons_01.consultationCode.zoo;

public class ZooExample {
    public static void main(String[] args) {

        Cat myCat = new Cat("Мурзик", 4);

        Dog dog1 = new Dog("Мухтар", "mastif");

        Dog dog2 = new Dog("Шон", "фокстерьер");

        Horse horse = new Horse("Кокос");


        myCat.greetings();
        dog1.greetings();
        dog2.greetings();
        horse.greetings();

        System.out.println(myCat.name);

    }
}
