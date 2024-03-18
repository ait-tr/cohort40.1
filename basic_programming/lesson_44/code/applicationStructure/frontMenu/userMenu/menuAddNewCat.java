package lesson_44.code.applicationStructure.frontMenu.userMenu;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_44.code.applicationStructure.backEnd.dto.CatFromUser;

public class menuAddNewCat {

    UserInput ui;

    public menuAddNewCat(UserInput ui) {
        this.ui = ui;
    }

    public CatFromUser inputCatName() {
        String catName = ui.inputText("Введите имя вашего питомца: ");
        return new CatFromUser(catName);
    }
}
