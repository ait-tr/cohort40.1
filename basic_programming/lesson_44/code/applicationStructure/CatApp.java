package lesson_44.code.applicationStructure;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.applicationStructure.backEnd.repository.CatRepository2;
import lesson_44.code.applicationStructure.backEnd.repository.CatRepositoryInterface;
import lesson_44.code.applicationStructure.backEnd.service.CatService;
import lesson_44.code.applicationStructure.backEnd.service.PrintCatService;
import lesson_44.code.applicationStructure.frontMenu.UserMenu;

public class CatApp {
    public static void main(String[] args) {
        CatRepositoryInterface repository = new CatRepository2();
        UserInput ui = new UserInput();
        PrintCatService printCatService = new PrintCatService(repository);
        CatService catService = new CatService(repository, ui);

        UserMenu userMenu = new UserMenu(printCatService, catService, ui);

        userMenu.start();

    }
}
