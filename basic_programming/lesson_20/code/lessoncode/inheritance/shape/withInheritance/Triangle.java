package lesson_20.code.lessoncode.inheritance.shape.withInheritance;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatorArea(){
        return sideA * sideB;
    }

    @Override
    public double calculatorPerimeter(){
        return ( sideA + sideB + sideC);
    }
}
