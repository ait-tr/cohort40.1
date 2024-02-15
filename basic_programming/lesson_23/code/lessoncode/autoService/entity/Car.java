package lesson_23.code.lessoncode.autoService.entity;

public class Car extends Vehicle{
    public Car(String vin, String brand, String model, int year) {
        super(vin, brand, model, year);
    }

    @Override
    public void showInfo() {
        System.out.println("Car: VIN = " + getVin() + " " + getBrand() + " " + getModel() + " (" + getYear() + ")");
    }
}
