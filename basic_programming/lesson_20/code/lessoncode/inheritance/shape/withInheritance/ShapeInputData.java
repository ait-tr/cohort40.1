package lesson_20.code.lessoncode.inheritance.shape.withInheritance;

public class ShapeInputData {

    public Shape[] inputShapesData(){
        Circle circle1 = new Circle("Circle 1", 5);
        Circle circle2 = new Circle("Circle 2", 9);
        Circle circle3 = new Circle("Circle 3", 15);

        Square square1 = new Square("Square 1", 3);
        Square square2 = new Square("Square 2", 10);
        Square square3 = new Square("Square 3", 20);

        Rectangle rectangle1 = new Rectangle("Rectangle 1", 3, 4);
        Rectangle rectangle2 = new Rectangle("Rectangle 2", 10, 12);
        Rectangle rectangle3 = new Rectangle("Rectangle 3", 25, 17);


        Triangle triangle1 = new Triangle("Triangle 1", 3, 4, 5);
        Triangle triangle2 = new Triangle("Triangle 2", 10, 12,15);
        Triangle triangle3 = new Triangle("Triangle 3", 25, 17,21);


        Shape[] shapes = {circle1,circle2,circle3,square1,square2,square3,rectangle1, rectangle2, rectangle3, triangle1, triangle2,triangle3};

        return shapes;
    }
}

