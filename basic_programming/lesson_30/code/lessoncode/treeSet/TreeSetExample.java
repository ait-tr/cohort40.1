package lesson_30.code.lessoncode.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> ourTreeSetCollection = new TreeSet<>();

        ourTreeSetCollection.add("Alex");
        ourTreeSetCollection.add("Robert");
        ourTreeSetCollection.add("John");
        ourTreeSetCollection.add("Andrew");

        System.out.println(ourTreeSetCollection);


        Set<Integer> ourTreeSetCollection2 = new TreeSet<>();

        ourTreeSetCollection2.add(10);
        ourTreeSetCollection2.add(1);
        ourTreeSetCollection2.add(7);
        ourTreeSetCollection2.add(112);
        ourTreeSetCollection2.add(0);
        ourTreeSetCollection2.add(100);

        System.out.println(ourTreeSetCollection2);


        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat("Barsik",2,"grey"));
        cats.add(new Cat("Murzik",5,"white"));
        cats.add(new Cat("Matvej",4,"black"));
        cats.add(new Cat("Vasjka",1,"blue"));
        cats.add(new Cat("Oskar",1,"red"));
        cats.add(new Cat("Oskar",3,"blue"));
        cats.add(new Cat("Vasjka",7, "purple"));

        System.out.println(cats);

    }
}
