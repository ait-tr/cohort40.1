package lesson_44.code.applicationStructure.frontMenu;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.applicationStructure.backEnd.dto.CatFromUser;
import lesson_44.code.applicationStructure.backEnd.service.CatService;
import lesson_44.code.applicationStructure.backEnd.service.PrintCatService;

public class UserMenu {

    PrintCatService printCatService;
    CatService catService;
    UserInput ui;

    public UserMenu(PrintCatService printCatService, CatService catService, UserInput ui) {
        this.printCatService = printCatService;
        this.catService = catService;
        this.ui = ui;
    }

    public void start(){

        while (true) {
            /*
            меню:
            1) добавление нового кота
            2) вывод информации о всех котах
            3) поиск кота по имени
            4) удаление кота из списка
            5) обновление данных о котах
            6) выход
             */

            String catName = ui.inputText("Введите имя вашего питомца: ");
            catService.addNewCat(new CatFromUser(catName));
            printCatService.printData();
        }
    }
}
