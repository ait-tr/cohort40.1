package consultation.cons_03.consultationCode.code.note;


import lesson_06.code.lessoncode.scanner.UserInput;

public class NoteManager {

    UserInput ui = new UserInput();


    public Note createNote(){

        int noteNumber = ui.inputInteger("Введите номер заметки: ");
        String noteText = ui.inputText("Введите текст заметки: ");

        int dayOfWeek = ui.inputInteger("Введите день недели (1-7)");
        DayOfWeek ourDay = null;

        switch (dayOfWeek) {
            case 1:
                ourDay = new DayOfWeek(1, "Monday");
                break;
            case 2:
                ourDay = new DayOfWeek(2, "Tuesday");
                break;
            case 3:
                ourDay = new DayOfWeek(3, "Wednesday");
                break;
            case 4:
                ourDay = new DayOfWeek(4, "Thursday");
                break;
            case 5:
                ourDay = new DayOfWeek(5, "Friday");
                break;
            case 6:
                ourDay = new DayOfWeek(6, "Saturday");
                break;
            case 7:
                ourDay = new DayOfWeek(7, "Sunday");
                break;
        }

        return new Note(noteNumber,noteText,ourDay);
    }
}
