package lesson_31.code.lessoncode.iterator;

import java.util.*;

public class CatIteratorExampleForListCollection {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

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



        // -------------- with LIST ITERATOR ------


        ListIterator<Cat> catIterator2 = cats.listIterator();

        //catIterator2.add(pushok);

        while (catIterator2.hasNext()) {
            Cat tempCat = catIterator2.next();
            System.out.println(tempCat);
            if (tempCat.getName().equals("Begemot")) {
                System.out.println("Equals");
                catIterator2.remove();
                catIterator2.add(pushok);
                catIterator2.add(new Cat("Matroskin"));
            }

            System.out.println("Есть ли следующий єлемент или нет? " + catIterator2.hasNext());
        }

        System.out.println("Коллекция кошек: ");
        System.out.println(cats);

        while (catIterator2.hasPrevious()){
            System.out.println(catIterator2.previous());
        }

    }
}
