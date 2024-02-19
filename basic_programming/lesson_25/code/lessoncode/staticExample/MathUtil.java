package lesson_25.code.lessoncode.staticExample;

public class MathUtil {
    public static void main(String[] args) {

        int radius = 10;

        double circleArea = Math.PI * radius * radius;

        System.out.println(Math.max(10,25));

        System.out.println("Площадь круга с радиусом = " + radius + " будет равна " + circleArea);

        System.out.println("Сумма 5 и 10 = " + MyMath.sum(5,10));
    }
}
