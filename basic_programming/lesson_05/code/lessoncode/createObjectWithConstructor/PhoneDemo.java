package lesson_05.code.lessoncode.createObjectWithConstructor;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        System.out.println(myPhone);

        myPhone.modelName = "iPhone 14 Max Pro";
        myPhone.simNumber = "+491234567";

        System.out.println(myPhone);

        Phone mySecondPhone = new Phone("Samsung Galaxy");

        System.out.println(mySecondPhone);

        mySecondPhone.simNumber = "+3809512344556";

        System.out.println(mySecondPhone);


    }
}
