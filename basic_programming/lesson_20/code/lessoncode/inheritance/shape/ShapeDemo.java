package lesson_20.code.lessoncode.inheritance.shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 10);
        System.out.println(circle.calculatorArea());
        System.out.println(circle.calculatorPerimeter());

        Square square = new Square("Square", 5);
        System.out.println(square.calculatorArea());
        System.out.println(square.calculatorPerimeter());


        Rectangle rectangle = new Rectangle("Rectangle", 5, 7);
        System.out.println(rectangle.calculatorArea());
        System.out.println(rectangle.calculatorPerimeter());


    }
}
