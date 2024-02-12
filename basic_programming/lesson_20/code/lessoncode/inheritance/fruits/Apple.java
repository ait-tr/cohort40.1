package lesson_20.code.lessoncode.inheritance.fruits;

import java.util.Arrays;

public class Apple extends Fruit{

    private String color;

    public Apple() {
        System.out.println("Sub-class constructor invoked.");
        System.out.println("Class - " + this.getClass());
        System.out.println();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", vitamins = " + Arrays.toString(getVitamins())+
                ", sugar = " + getSugar() +
                '}';
    }
}
