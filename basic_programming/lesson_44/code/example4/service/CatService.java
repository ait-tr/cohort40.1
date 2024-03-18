package lesson_44.code.example4.service;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.example4.entity.Cat;
import lesson_44.code.example4.repository.CatRepository;

public class CatService {

    private CatRepository repository = new CatRepository();
    private UserInput ui = new UserInput();

    private Cat createNewCat(){
        String catName = ui.inputText("Введите имя вашего питомца: ");
        Cat newCat = new Cat(catName);
        return newCat;
    }

    public void addNewCat(){
        Cat newCat = createNewCat();
        repository.addCat(newCat);
    }

    public CatRepository getRepository() {
        return repository;
    }
}
