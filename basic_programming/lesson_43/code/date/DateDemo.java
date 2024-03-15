package lesson_43.code.date;

import java.time.*;
import java.util.Set;

public class DateDemo {
    public static void main(String[] args) {
        // LocalDate

        LocalDate today = LocalDate.now();
        System.out.println("Сегодняшняя дата: " + today);

        LocalDate specificDate = LocalDate.of(2024, 1, 1);
        System.out.println("Конкретная дата: " + specificDate);

        LocalDate parsedDate = LocalDate.parse("2024-02-01");
        System.out.println("Разобранная дата: " + parsedDate);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Дата завтра: " + tomorrow);


        // LocalTime

        LocalTime now2 = LocalTime.now();
        System.out.println("Текущее время: " + now2);

        LocalTime specificTime = LocalTime.of(13, 30, 15);
        System.out.println("Конкретное время: " + specificTime);

        LocalTime parsedTime = LocalTime.parse("20:45:30");
        System.out.println("Разобранное время: " + parsedTime);



        // LocalDateTime

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Текущие дата и время: " + now);

        LocalDateTime specificDateTime = LocalDateTime.of(2024, 3, 1, 10, 45, 30);
        System.out.println("Конкретные дата и время: " + specificDateTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-01-01T20:45:30");
        System.out.println("Разобранные дата и время: " + parsedDateTime);




        // ZonedDateTime

        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Текущие дата и время в Токио: " + nowInTokyo);

        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(specificDateTime, ZoneId.of("Europe/Paris"));
        System.out.println("Конкретные дата и время в определенном часовом поясе: " + specificZonedDateTime);


//        Set<String> zones = ZoneId.getAvailableZoneIds();
//        for (String zone : zones) {
//            System.out.println(zone);
//        }

// -----------------------
        Period tenDays = Period.ofDays(10);
        System.out.println("Период в десять дней: " + tenDays);

        Duration threeMinutes = Duration.ofMinutes(3);
        System.out.println("Длительность в три минуты: " + threeMinutes);



    }
}
