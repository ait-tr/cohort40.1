package lesson_24.code.lessoncode.arrayWithOutInterfaces;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.Arrays;

public class SkladOperations {

    public void operations(UserInput ui, Sklad sklad){

        sklad.fillSklad();

        String searchName = ui.inputText("Введите название для поиска");

        System.out.println(Arrays.toString(sklad.finByName(searchName)));
    }
}
