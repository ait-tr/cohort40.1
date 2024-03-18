package lesson_44.code.example5.repository;

import lesson_44.code.example5.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatRepository2 implements CatRepositoryInterface{

    private List<Cat> cats;

    public CatRepository2() {
        this.cats = new ArrayList<>();
    }


    public void addCat(Cat newCat) {
        cats.add(newCat);
    }

    public List<Cat> findAll(){
        return cats;
    }

    public void delete(Cat cat){};

    public Cat findCatByName(String catName){return null;};


}
