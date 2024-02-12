package lesson_20.code.lessoncode.abstraction;

public class SedanCar extends Car{
    public SedanCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("BEEEP !!!");
    }

    @Override
    int speedUp() {
        System.out.println("наш седан ускоряется до 120");
        return 120;
    }
}
