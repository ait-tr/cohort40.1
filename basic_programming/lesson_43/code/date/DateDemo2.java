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

    }
}
