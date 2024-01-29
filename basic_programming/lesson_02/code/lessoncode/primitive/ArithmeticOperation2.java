package lesson_02.code.lessoncode.primitive;

public class ArithmeticOperation2 {
    public static void main(String[] args) {

      int x = 10;
      int y = 3;

        System.out.println( x / y);
        System.out.println( x % y);

        double xDouble = 10.5;
        double yDouble = 5.5;

        System.out.println(xDouble / yDouble);

        System.out.println(xDouble / y);

        double doubleVariable = 3;

        System.out.println("doubleVariable = " + doubleVariable);

        double divResult = x / y;

        System.out.println("Результат деления целого числа на целое число " + divResult);

        // как избежать целочисленного деления?
        // вариант 1:
        xDouble = 10;
        System.out.println(xDouble / y);

        //вариант 2 - произвести "трансформацию" или конвертацию типа (изменить тип данных)

        divResult = (float) x / y;
        System.out.println(divResult);

    }
}
