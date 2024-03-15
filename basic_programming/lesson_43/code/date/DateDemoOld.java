package lesson_43.code.date;

import java.util.Calendar;
import java.util.Date;

public class DateDemoOld {
    public static void main(String[] args) {
        Date nowDate = new Date();

        System.out.println("Текущая дата и время: " + nowDate);

        /*
        after(Date) - проверяет что этот момент времени после указанной даты
        before(Date)
        getTime() - возвращает количество миллисекунд
        setTime(Long time) - устанавливает время
         */
        Date anotherDate = new Date(1500000000000L);

        System.out.println("Дата, которая соответствует 1 500 000 000 000 миллисекунд с 1 января 1970 года" + anotherDate);

        System.out.println("Текущая дата после anotherDate? " + nowDate.after(anotherDate));

        // -----------------  CALENDAR --------

        Calendar cal = Calendar.getInstance();

        System.out.println("Текущее время: " + cal.getTime());

        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
        cal.set(Calendar.DATE, 28);

        System.out.println("Измененная дата: " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Добавляем к дате один день: " + cal.getTime());




    }
}
