package lesson_35.code.lessoncode.finalExample.finalForVariable;

import java.util.Collections;
import java.util.List;

public class CatsDemo {
    public static void main(String[] args) {
        CatRepository repository = new CatRepository();

        repository.cats.add(new Cat("Murzik"));

        repository.cats.add(new Cat("Barsik"));
        //System.out.println(repository.cats);


       // repository.cats.get(0).setName("Kuzja");
       // System.out.println(repository.cats);


        List<Cat> unModificationCat = Collections.unmodifiableList(repository.cats);

        System.out.println(unModificationCat);

//        unModificationCat.add(new Cat("Kuzja"));
//
//        System.out.println(unModificationCat);

        unModificationCat.get(0).setName("Lastochka");
        System.out.println(unModificationCat);
    }
}
