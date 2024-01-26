import scanner.UserInput;

public class NoteManager {

    UserInput ui = new UserInput();


    public Note createNote(){

        return new Note(
                ui.inputInteger("Введите номер заметки: "),
                ui.inputText("Введите текст заметки: ")
        );
    }
}
