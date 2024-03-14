package lesson_42.code.javaInputOutput.standardIO;

import java.util.Date;

public class StandardPrintMethods {

    /*

Методы печати, которые мы используем для вывода результата:
   - print() – стандартный метод
Не переводит «каретку»

    - println() – стандартный метод
Переводит «каретку»

    - printf() – позволяет производить форматирование
Разделитель строк %n
Логическое форматирование %b
Форматирование строк %s
Форматирование символов %c
Форматирование целых чисел %d
Форматирование не целочисленных значений %f
Форматирование даты и времени %t and T
Символы H, M, S отвечают за часы, минуты и секунды
A выводит полный день недели.
d форматирует двузначный день месяца.
B для полного названия месяца.
m форматирует двузначный месяц.
Y выводит год в виде четырех цифр.
y выводит две последние цифры года.

     */

    public static void main(String[] args) {

        System.out.println("Перенос на новую строку");

        System.out.print("Печать без переноса ");
        System.out.print("строки ");
        System.out.println();

        System.out.printf("one%ntwo%nthree");

        System.out.println();

        System.out.printf("%b%n", null);
        System.out.printf("%b%n", "null");

        System.out.printf("%B", false);
        System.out.println();

        System.out.printf("%d%n", 2);

        int x = 100;

        System.out.printf("printing simple integer: x = %d", x);
        System.out.println();

        System.out.printf("printing simple integer: Pi = %.4f", 12345.67890123);

        System.out.println();

        System.out.println("Примеры с датой");

        Date date = new Date();

        System.out.printf("hours %tH: minutes %tM: sec %tS%n",date,date,date);

        System.out.printf("%1$tA, %1$td  %1$tB %1$tY %n", date);

    }

}
