package lesson_09.code.lessoncode.note;

import lesson_06.code.lessoncode.scanner.UserInput;

public class NoteManager {

    UserInput ui = new UserInput();


    public Note createNote(){

        return new Note(
                ui.inputInteger("Введите номер заметки: "),
                ui.inputText("Введите текст заметки: ")
        );
    }
}
