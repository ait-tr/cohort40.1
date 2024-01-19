package classMethods;

public class Cat {
    int age;

    public void catMeow(){
        System.out.println("Meow!!!");
    }

    public void catBirthday(){
        System.out.println("У моей кошки сегодня день рождения!");
        System.out.println("Ей было " + age + " лет");
        age = age + 1;
        System.out.println("а теперь ей " + age);
    }

}
