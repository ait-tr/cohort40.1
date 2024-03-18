package lesson_44.code.applicationStructure.backEnd.repository;

import lesson_44.code.applicationStructure.backEnd.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatRepository2 implements CatRepositoryInterface{

    private List<Cat> cats;

    int counter = 0;

    public CatRepository2() {
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat newCat) {
        counter++;
        cats.add(new Cat(counter, newCat.getName()));
    }

    public List<Cat> findAll(){
        return cats;
    }

    public void delete(Cat cat){};

    public Cat findCatByName(String catName){return null;};


}
