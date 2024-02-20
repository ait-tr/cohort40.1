package lesson_26.code.lessoncode.arrayListObjects;

import java.util.ArrayList;

public class Cats {

    ArrayList<Cat> cats = new ArrayList<>();

    public void addCat(Cat newCat) {
        cats.add(newCat);
    }

    public void runawayCat(Cat cat){
        cats.remove(cat);
    }
}
