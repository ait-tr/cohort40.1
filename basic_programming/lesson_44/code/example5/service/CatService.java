package lesson_44.code.example5.service;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.example5.entity.Cat;
import lesson_44.code.example5.repository.CatRepository;
import lesson_44.code.example5.repository.CatRepositoryInterface;

public class CatService {

    private CatRepositoryInterface repository;

    public CatService(CatRepositoryInterface repository, UserInput ui) {
        this.repository = repository;
        this.ui = ui;
    }

    private UserInput ui;

    private Cat createNewCat(){
        String catName = ui.inputText("Введите имя вашего питомца: ");
        Cat newCat = new Cat(catName);
        return newCat;
    }

    public void addNewCat(){
        Cat newCat = createNewCat();
        repository.addCat(newCat);
    }


}
