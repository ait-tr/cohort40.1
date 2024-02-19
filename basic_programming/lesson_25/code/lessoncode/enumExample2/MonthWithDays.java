package lesson_25.code.lessoncode.enumExample2;

public enum MonthWithDays {
    // public class Month extends Enum
    JANUARY("Январь", 31),
    FEBRUARY("Февраль", 28),
    MARCH("Март", 31),
    APRIL("Апрель", 30),
    MAY("Май", 31),
    JUNE("Июнь", 30),
    JULY("Июль", 31),
    AUGUST("Август", 31),
    SEPTEMBER("Сентябрь", 30),
    OCTOBER("Октябрь", 31),
    NOVEMBER("Ноябрь", 30),
    DECEMBER("Декабрь", 31);

    private String name;
    private int daysCount;

    MonthWithDays(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }


    public static MonthWithDays[] getWinterMonths(){
        return new MonthWithDays[] {DECEMBER, JANUARY, FEBRUARY};
    }

    public static MonthWithDays[] getSummerMonths(){
        return new MonthWithDays[] {JUNE, JULY, AUGUST};
    }

    public String getName() {
        return name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    @Override
    public String toString() {
        return "MonthWithDays{" +
                "name='" + name + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }
}
