package lesson_04.code.lessoncode.classMethods;

public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.age = 5;
        myCat.catMeow();
        myCat.catBirthday("ДЕНЬ РОЖДЕНИЯ МОЕЙ КОШКИ!");

        System.out.println(myCat.age);

        Cat mySecondCat = new Cat();
        mySecondCat.age = 2;

        System.out.println("У моей кошки сегодня день рождения!");
        System.out.println("Ей было " + mySecondCat.age + " лет");
        mySecondCat.age = mySecondCat.age + 1;
        System.out.println("а теперь ей " + mySecondCat.age);

        mySecondCat.catBirthday("ДЕНЬ РОЖДЕНИЯ ВТОРОЙ КОШКИ");
    }
}
