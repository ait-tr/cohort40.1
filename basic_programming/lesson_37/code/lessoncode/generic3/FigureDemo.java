package lesson_37.code.lessoncode.generic3;

import lesson_36.code.lessoncode.generic3.Circle;
import lesson_36.code.lessoncode.generic3.Rectangle;

public class FigureDemo {
    public static void main(String[] args) {
        // пример на Rectangle с Integer

        lesson_36.code.lessoncode.generic3.Rectangle<Integer> rInt = new lesson_36.code.lessoncode.generic3.Rectangle<>(10,30);

        double areaRect = rInt.area();
        System.out.println("Rectangle area = " + areaRect);

        // пример на Rectangle с Double

        lesson_36.code.lessoncode.generic3.Rectangle<Double> rDouble = new Rectangle<>(10.5,52.5);

        areaRect = rDouble.area();
        System.out.println("Rectangle area = " + areaRect);

        // пример на Circle с Float

        lesson_36.code.lessoncode.generic3.Circle<Float> cFloat = new Circle<>(10.5f);

        double areaCircle = cFloat.area();
        System.out.println("Circle area = " + areaCircle);

    }
}
