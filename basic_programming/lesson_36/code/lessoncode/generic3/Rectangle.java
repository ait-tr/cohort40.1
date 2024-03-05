package lesson_36.code.lessoncode.generic3;

public class Rectangle <T extends Number> implements Figure{

    private T side1;
    private T side2;

    public Rectangle(T side1, T side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return (side1.doubleValue()* side2.doubleValue());
    }
}
