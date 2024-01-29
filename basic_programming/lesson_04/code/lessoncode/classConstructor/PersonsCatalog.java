package lesson_04.code.lessoncode.classConstructor;

public class PersonsCatalog {
    public static void main(String[] args) {
        Person person1 = new Person("Ruslan", "Romanov", "10-06-1975");

        System.out.println(person1.firstName);
        System.out.println(person1.surName);
        System.out.println(person1.birthday);
        System.out.println(person1.age);
        System.out.println(person1.address);

        person1.age = 48;
        person1.address = "Riga";
        System.out.println("==================");
        System.out.println(person1.firstName);
        System.out.println(person1.surName);
        System.out.println(person1.birthday);
        System.out.println(person1.age);
        System.out.println(person1.address);


    }
}
