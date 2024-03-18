package lesson_44.code.applicationStructure.backEnd.repository;

import lesson_44.code.applicationStructure.backEnd.entity.Cat;

import java.util.List;

public interface CatRepositoryInterface {


    public void addCat(Cat newCat);

    public List<Cat> findAll();

    public void delete(Cat cat);

    public Cat findCatByName(String catName);

}
