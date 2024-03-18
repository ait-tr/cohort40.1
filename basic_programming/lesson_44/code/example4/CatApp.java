package lesson_44.code.example4;

import lesson_44.code.example4.entity.Cat;
import lesson_44.code.example4.service.CatService;

public class CatApp {
    public static void main(String[] args) {
        CatService catService = new CatService();

        catService.addNewCat();
        catService.getRepository().printData();

        catService.getRepository().addCat(new Cat(""));

        catService.getRepository().printData();
    }
}
