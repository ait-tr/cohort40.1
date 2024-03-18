package lesson_44.code.example4.repository;

import lesson_44.code.example4.entity.Cat;

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

    public void printData(){
        System.out.println("Список кошек и котов:");
        for (Cat cat : cats){
            System.out.println( "Кличка кошки / кота: " + cat.getName());
        }
    }
}
