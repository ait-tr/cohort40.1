package lesson_25.code.lessoncode.enumExample;

import java.util.Arrays;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        DayOfWeekByClass day = new DayOfWeekByClass("Суббота");
        System.out.println(day);

        DayOfWeekByClass[] days = {new DayOfWeekByClass("Понедельник"),
                new DayOfWeekByClass("Вторник"),
                new DayOfWeekByClass("Среда"),
                new DayOfWeekByClass("Четверг"),
                new DayOfWeekByClass("Пятница"),
                new DayOfWeekByClass("Суббота"),
                new DayOfWeekByClass("Воскресенье")};


        // DayOfWeekOld sunday = new DayOfWeekOld(); - ошибка компилятора


        DayOfWeekOld sunday = DayOfWeekOld.SUNDAY;
        System.out.println(sunday);


        ScholarSchedule schedule = new ScholarSchedule(DayOfWeek.MONDAY);

        Scholar scholar = new Scholar(schedule);
        scholar.wakeUp();


        System.out.println(Arrays.toString(DayOfWeek.values()));


        System.out.println(DayOfWeek.FRIDAY.ordinal());

        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");

        System.out.println(monday);
    }

}
