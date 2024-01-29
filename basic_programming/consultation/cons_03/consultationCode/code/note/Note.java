package consultation.cons_03.consultationCode.code.note;

public class Note {

    private int id;
    private String description;
    private DayOfWeek dayOfWeek;

    public Note(int id, String description, DayOfWeek dayOfWeek) {
        this.id = id;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
