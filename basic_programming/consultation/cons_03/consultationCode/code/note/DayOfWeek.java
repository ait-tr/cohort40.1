package consultation.cons_03.consultationCode.code.note;

public class DayOfWeek {
    int numberOfDay;
    String day;

    public DayOfWeek(int numberOfDay, String day) {
        this.numberOfDay = numberOfDay;
        this.day = day;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "numberOfDay=" + numberOfDay +
                ", day='" + day + '\'' +
                '}';
    }
}
