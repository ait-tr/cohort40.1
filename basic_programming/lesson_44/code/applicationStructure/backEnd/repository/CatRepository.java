package lesson_44.code.applicationStructure.backEnd.repository;

import lesson_44.code.applicationStructure.backEnd.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatRepository {

    private List<Cat> cats;

    public CatRepository() {
        this.cats = new ArrayList<>();
    }


    public void addCat(Cat newCat) {
        cats.add(newCat);
    }

    public List<Cat> findAll(){
        return cats;
    }


}
