package lesson_44.code.example5;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.example5.repository.CatRepository;
import lesson_44.code.example5.repository.CatRepository2;
import lesson_44.code.example5.repository.CatRepositoryInterface;
import lesson_44.code.example5.service.CatService;
import lesson_44.code.example5.service.PrintCatService;
import lesson_44.code.example5.service.UserMenu;

public class CatApp {
    public static void main(String[] args) {
        CatRepositoryInterface repository = new CatRepository2();
        UserInput ui = new UserInput();
        PrintCatService printCatService = new PrintCatService(repository);
        CatService catService = new CatService(repository, ui);

        UserMenu userMenu = new UserMenu(printCatService, catService);

        userMenu.start();

    }
}
