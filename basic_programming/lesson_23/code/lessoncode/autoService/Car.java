package lesson_23.code.lessoncode.autoService;

public class Car extends Vehicle{
    public Car(String vin, String brand, String model, int year) {
        super(vin, brand, model, year);
    }

    @Override
    void showInfo() {
        System.out.println("Car: VIN = " + getVin() + " " + getBrand() + " " + getModel() + " (" + getYear() + ")");
    }
}
