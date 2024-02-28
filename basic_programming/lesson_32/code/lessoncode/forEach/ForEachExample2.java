package lesson_32.code.lessoncode.forEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachExample2 {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Phinic"));
        cats.add(new Cat("Lastocka"));
        cats.add(new Cat("Hamon"));
        cats.add(new Cat("Oskar"));
        cats.add(new Cat("Pixel"));

        Set<Cat> catSetLiteralP = new HashSet<>();

        for (Cat currentCat : cats){
            System.out.println(currentCat.name);
            if (currentCat.name.startsWith("P")) {
                catSetLiteralP.add(currentCat);
            }
        }

        System.out.println(catSetLiteralP);
    }
}
