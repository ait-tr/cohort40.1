package lesson_35.code.lessoncode.finalExample.finalForVariable;

import java.util.ArrayList;
import java.util.List;

public class CatRepository {

    final List<Cat> cats ;

    public CatRepository() {
        this.cats = new ArrayList<>();
    }

//    public void changeCollection(ArrayList<Cat> newCollection){
//        cats = newCollection;
//    }
}
