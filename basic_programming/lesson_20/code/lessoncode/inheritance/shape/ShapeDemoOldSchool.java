package lesson_20.code.lessoncode.inheritance.shape;

public class ShapeDemoOldSchool {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle 1", 5);
        Circle circle2 = new Circle("Circle 2", 9);
        Circle circle3 = new Circle("Circle 3", 15);


        Square square1 = new Square("Square 1", 3);
        Square square2 = new Square("Square 2", 10);
        Square square3 = new Square("Square 3", 20);



        Rectangle rectangle1 = new Rectangle("Rectangle 1", 3, 4);
        Rectangle rectangle2 = new Rectangle("Rectangle 2", 10, 12);
        Rectangle rectangle3 = new Rectangle("Rectangle 3", 25, 17);


        Circle[] circles = {circle1,circle2,circle3};

        Square[] squares = {square1,square2,square3};

        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3};

        double allAreas = 0;

        for (int i = 0; i < circles.length; i++) {
            allAreas = allAreas + circles[i].calculatorArea();
        }

        for (int i = 0; i < squares.length; i++) {
            allAreas = allAreas + squares[i].calculatorArea();
        }

        for (int i = 0; i < rectangles.length; i++) {
            allAreas = allAreas + rectangles[i].calculatorArea();
        }

        System.out.println("площадь всех фигур = " + allAreas);

    }
}
