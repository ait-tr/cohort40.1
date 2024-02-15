package lesson_23.code.lessoncode.autoService;

public class Truck extends Vehicle{
    public Truck(String vin, String brand, String model, int year) {
        super(vin, brand, model, year);
    }

    @Override
    void showInfo() {
        System.out.println("Truck:  VIN = " + getVin() + " " + getBrand() + " " + getModel() + " (" + getYear() + ")");
    }
}
