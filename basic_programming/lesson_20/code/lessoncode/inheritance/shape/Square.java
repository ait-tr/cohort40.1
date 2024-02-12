package lesson_20.code.lessoncode.inheritance.shape;

public class Square {
    private String title;
    private double sideA;

    public Square(String title, double sideA) {
        this.title = title;
        this.sideA = sideA;
    }

    public double calculatorArea(){
        return sideA * sideA;
    }
    public double calculatorPerimeter(){
        return 4 *  sideA;
    }
}
