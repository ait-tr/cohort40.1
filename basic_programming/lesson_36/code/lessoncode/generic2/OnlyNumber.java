package lesson_36.code.lessoncode.generic2;

public class OnlyNumber <T extends Number>{

    private T number;

    public OnlyNumber(T number) {
        this.number = number;
    }

    public void printNumber(){
        System.out.println("Ваш номер: " + number);
    }

    public void printSquare(){
        System.out.println("Квадрат числа = " + (number.doubleValue() * number.doubleValue()));
    }
}
