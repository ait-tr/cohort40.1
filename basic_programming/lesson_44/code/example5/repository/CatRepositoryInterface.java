package lesson_44.code.example5.repository;

import lesson_44.code.example5.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public interface CatRepositoryInterface {


    public void addCat(Cat newCat);

    public List<Cat> findAll();

    public void delete(Cat cat);

    public Cat findCatByName(String catName);

}
