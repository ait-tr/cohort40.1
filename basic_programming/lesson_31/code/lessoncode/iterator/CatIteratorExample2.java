package lesson_31.code.lessoncode.iterator;

import java.util.*;

public class CatIteratorExample2 {
    public static void main(String[] args) {

        Set<Cat> cats = new HashSet<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        Cat begemot = new Cat("Begemot");
        Cat lastochka = new Cat("Lastochka");
        Cat lucky = new Cat("Lucky");

        Cat pushok = new Cat("Pushokl");

        cats.add(murzik);
        cats.add(barsik);
        cats.add(begemot);
        cats.add(lastochka);
        cats.add(lucky);



        // -------------- with ITERATOR ------


        Iterator<Cat> catIterator2 = cats.iterator();

        while (catIterator2.hasNext()) {
            Cat tempCat = catIterator2.next();
            System.out.println(tempCat);
            if (tempCat.getName().equals("Begemot")){
                System.out.println("Equals");
                catIterator2.remove();
            }

            System.out.println("Есть ли следующий єлемент или нет? " + catIterator2.hasNext());
        }

        System.out.println("Коллекция кошек: ");
        System.out.println(cats);

    }
}
