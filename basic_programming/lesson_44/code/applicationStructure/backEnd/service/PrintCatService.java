package lesson_44.code.applicationStructure.backEnd.service;

import lesson_44.code.applicationStructure.backEnd.entity.Cat;
import lesson_44.code.applicationStructure.backEnd.repository.CatRepositoryInterface;

public class PrintCatService {

    public PrintCatService(CatRepositoryInterface repository) {
        this.repository = repository;
    }

    private CatRepositoryInterface repository;

    public void printData(){
            System.out.println("Список кошек и котов:");
            for (Cat cat : repository.findAll()){
                System.out.println( "catId = " + cat.getCatId() + "  Кличка кошки / кота: " + cat.getName());
            }
    }

}
