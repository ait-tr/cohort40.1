package lesson_24.code.lessoncode.arrayWithInterfaces;

import lesson_06.code.lessoncode.scanner.UserInput;

public class MagazineRepository {

    Magazine[] magazines;

    public MagazineRepository(int magazinesQuantity) {
        this.magazines = new Magazine[magazinesQuantity];
    }


    public void fill(){
        magazines[0] = new Magazine("Журнал1", 2000, "1");
        magazines[1] = new Magazine("Журнал2", 2001, "3");
        magazines[2] = new Magazine("Журнал3", 2002, "5");
        magazines[3] = new Magazine("Журнал1", 2003, "12");
        magazines[4] = new Magazine("Журнал3", 2004, "25");

    }

    public void fillRepository() {

        for (int i = 0; i < magazines.length; i++) {
            magazines[i] = createNewMagazine();
        }
    }


    private Magazine createNewMagazine() {
        UserInput ui = new UserInput();
        String title = ui.inputText("Введите название журнала: ");
        int year = ui.inputInteger("Введите год издания: ");
        String issuedNumber = ui.inputText("Введите номер выпуска журнала: ");


        return new Magazine(title, year, issuedNumber);
    }
}


