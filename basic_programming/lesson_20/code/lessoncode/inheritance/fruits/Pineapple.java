package lesson_20.code.lessoncode.inheritance.fruits;

import java.util.Arrays;

public class Pineapple extends Fruit{

    private int cellulose;

    public Pineapple() {
        System.out.println("Sub-class constructor invoked.");
        System.out.println("Class - " + this.getClass());
        System.out.println();
    }

    public int getCellulose() {
        return cellulose;
    }

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "cellulose=" + cellulose +
                ", vitamins = " + Arrays.toString(getVitamins())+
                ", sugar = " + getSugar() +
                '}';
    }
}
