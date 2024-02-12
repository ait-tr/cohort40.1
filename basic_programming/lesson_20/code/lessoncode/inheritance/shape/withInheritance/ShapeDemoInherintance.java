package lesson_20.code.lessoncode.inheritance.shape.withInheritance;

public class ShapeDemoInherintance {
    public static void main(String[] args) {

        ShapeUtil util = new ShapeUtil();
        ShapeInputData shapeInputData = new ShapeInputData();

        Shape[] shapes = shapeInputData.inputShapesData();

        System.out.println("периметр всех фигур = " + util.calculateAllPerimeters(shapes));

    }
}
