package lesson_09.code.lessoncode.note;

public class NoteDemo {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();

        Note note1 = manager.createNote();
        Note note2 = manager.createNote();
        Note note3 = manager.createNote();

        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);

    }
}
