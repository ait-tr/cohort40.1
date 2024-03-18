package lesson_44.code.example5.service;

public class UserMenu {

    PrintCatService printCatService;
    CatService catService;

    public UserMenu(PrintCatService printCatService, CatService catService) {
        this.printCatService = printCatService;
        this.catService = catService;
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
            catService.addNewCat();
            printCatService.printData();
        }
    }
}
