package lesson_25.code.lessoncode.enumExample2;

public class MonthOld {

    private String name;
    private int dayCount;

    public MonthOld(String name, int dayCount) {
        this.name = name;
        this.dayCount = dayCount;
    }

    public String getName() {
        return name;
    }

    public int getDayCount() {
        return dayCount;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", dayCount=" + dayCount +
                '}';
    }
}
