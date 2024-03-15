package lesson_43.code.date;

import java.time.*;
import java.time.temporal.ChronoField;

public class DateDemo2 {
    public static void main(String[] args) {
        // LocalDate

        LocalDate today = LocalDate.of(2024,3,14);
        int weekOfYear = today.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        int weekOfMonth = today.get(ChronoField.ALIGNED_WEEK_OF_MONTH);

        System.out.println(weekOfMonth);

        System.out.println(weekOfYear);


        int monthVaLue = today.getMonthValue();

        int quarter = (monthVaLue - 1) / 3 + 1;

        System.out.println(quarter);



        LocalDateTime dateTime1 = LocalDateTime.of (2024, 3,14,10,0);
        LocalDateTime dateTime2 = LocalDateTime.of (2024, 3,15,10,0);

        boolean isBefore = dateTime1.isBefore(dateTime2);
        boolean isAfter = dateTime1.isAfter(dateTime2);

        System.out.println("dateTime1 is before dateTime2 : " + isBefore);
        System.out.println("dateTime1 is after dateTime2 : " + isAfter);


    }
}
