package lesson_20.code.lessoncode.abstraction;

public class TruckCar extends Car{
    public TruckCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("TRUCK !!!");
    }

    @Override
    int speedUp() {
        System.out.println("ГРУЗОВИК");
        return 100;
    }
}
