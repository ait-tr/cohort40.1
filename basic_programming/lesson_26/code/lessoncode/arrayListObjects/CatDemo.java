package lesson_26.code.lessoncode.arrayListObjects;

public class CatDemo {
    public static void main(String[] args) {

        Cats cats = new Cats();

        for (int i = 0; i < 6; i++) {

            Cat cat = new Cat("Cat # " + (i + 1), "breed # " + (i + 1));
            cats.addCat(cat);

        }

        System.out.println(cats.cats);

        Cat runawayCat = new Cat("Cat # 3", "breed # 3");

        cats.runawayCat(runawayCat);
        System.out.println(cats.cats);

    }
}
