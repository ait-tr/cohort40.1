package lesson_44.code.applicationStructure.backEnd.service;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.applicationStructure.backEnd.dto.CatFromUser;
import lesson_44.code.applicationStructure.backEnd.entity.Cat;
import lesson_44.code.applicationStructure.backEnd.repository.CatRepositoryInterface;

public class CatService {

    private CatRepositoryInterface repository;

    public CatService(CatRepositoryInterface repository, UserInput ui) {
        this.repository = repository;
        this.ui = ui;
    }

    private UserInput ui;

    private Cat createNewCat(String catName){
        // провели валидацию (проверку) корректности имени

        Cat newCat = new Cat(catName);
        return newCat;
    }

    public void addNewCat(CatFromUser catFromUser){
        Cat newCat = createNewCat(catFromUser.getCatName());
        repository.addCat(newCat);
    }


}
