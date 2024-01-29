package lesson_02.code.lessoncode.primitive;

public class ArithmeticOperation {
    public static void main(String[] args) {

        System.out.println("Пример печати на консоль");
        System.out.println("Второй пример " + "печати");


        System.out.println("2 + 2 = " + 4);

        // объявим переменные, произведем с ними операции и распечатаем результат

        int x = 10;
        int y = 5;

        System.out.println("Результат деление x / y = " + (x / y));

        int resultOfMultiplication = x * y;
        System.out.println("результат умножения = " + resultOfMultiplication);

        double xDouble = 10.5;
        double yDouble = 5.5;

        double doubleResult = xDouble - yDouble;

        System.out.println(doubleResult);

    }
}
