package lesson_03.code.lessoncode;

public class Hw2_3 {
    public static void main(String[] args) {

        int number = 345;

        // нужно с помощью математических действий добиться чтобы:
        // в переменной d1 было значение равное 3
        // в переменной d2 было значение равное 4
        // в переменной d3 было значение равное 5

        int d1 = number / 100;

        int d2 = (number - d1 * 100) / 10;

        int d3 = number - d1 * 100 - d2 * 10;

        System.out.println("Первая цифра нашего числа = " + d1);
        System.out.println("Вторая цифра нашего числа = " + d2);
        System.out.println("Третья цифра нашего числа = " + d3);

        System.out.println("" + d1 + d2 + d3);


        d1 = number / 100;

        d2 = (number / 10) % 10;

        d3 = number % 10;

        System.out.println("Первая цифра нашего числа = " + d1);
        System.out.println("Вторая цифра нашего числа = " + d2);
        System.out.println("Третья цифра нашего числа = " + d3);

    }
}
