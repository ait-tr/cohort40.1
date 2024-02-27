package lesson_31.code.lessoncode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatIteratorExample {
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

        System.out.println(cats);

//        for (Cat tempCat : cats){
//            if (tempCat.getName().equals("Begemot")){
//                //cats.remove(begemot);
//                cats.add(pushok);
//            }
//        }

        // -------------- with ITERATOR ------

        Iterator<Cat> catIterator = cats.iterator();

        while (catIterator.hasNext()) {
            Cat tempCat = catIterator.next();
            System.out.println(tempCat);
        }

        System.out.println("---- ITERATOR 2 ------");
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
