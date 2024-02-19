package lesson_25.code.lessoncode.enumExample;

public class ScholarSchedule {
    private DayOfWeek day;

    private String name;


    public ScholarSchedule(DayOfWeek day) {
        this.day = day;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }
}
