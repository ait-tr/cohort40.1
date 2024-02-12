package lesson_20.code.lessoncode.inheritance.shape;

public class Rectangle {
    private String title;
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        this.title = title;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculatorArea(){
        return sideA * sideB;
    }
    public double calculatorPerimeter(){
        return 2 * ( sideA + sideB );
    }
}
