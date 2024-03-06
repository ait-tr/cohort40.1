package consultation.cons_14.consultationCode.generics2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CacheDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Cache<String> cacheString = new Cache<>(strings);

        cacheString.addElement("One");
        cacheString.addElement("Two");
        cacheString.addElement("Four");
        cacheString.addElement("Ten");

        cacheString.printList();
//---------------------------------

        System.out.println();

        List<Cat> cats = new LinkedList<>();

        Cache<Cat> catCache = new Cache<>(cats);

        catCache.addElement(new Cat("Barsik"));
        catCache.addElement(new Cat("Murzik"));
        catCache.addElement(new Cat("Lucky"));
        catCache.addElement(new Cat("Rocky"));

        catCache.printList();
    }
}
