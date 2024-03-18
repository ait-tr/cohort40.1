package lesson_44.code.example5.service;

import lesson_44.code.example5.entity.Cat;
import lesson_44.code.example5.repository.CatRepository;
import lesson_44.code.example5.repository.CatRepositoryInterface;

public class PrintCatService {

    public PrintCatService(CatRepositoryInterface repository) {
        this.repository = repository;
    }

    private CatRepositoryInterface repository;

    public void printData(){
            System.out.println("Список кошек и котов:");
            for (Cat cat : repository.findAll()){
                System.out.println( "Кличка кошки / кота: " + cat.getName());
            }
    }

}
