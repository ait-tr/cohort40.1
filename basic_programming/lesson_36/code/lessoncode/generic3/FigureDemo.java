package lesson_36.code.lessoncode.generic3;

public class FigureDemo {
    public static void main(String[] args) {
        // пример на Rectangle с Integer

        Rectangle<Integer> rInt = new Rectangle<>(10,30);

        double areaRect = rInt.area();
        System.out.println("Rectangle area = " + areaRect);

        // пример на Rectangle с Double

        Rectangle<Double> rDouble = new Rectangle<>(10.5,52.5);

        areaRect = rDouble.area();
        System.out.println("Rectangle area = " + areaRect);

        // пример на Circle с Float

        Circle<Float> cFloat = new Circle<>(10.5f);

        double areaCircle = cFloat.area();
        System.out.println("Circle area = " + areaCircle);

    }
}
