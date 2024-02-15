package lesson_23.code.lessoncode.autoService;

public class Moto extends Vehicle{

    private String stileType;

    public Moto(String vin, String brand, String model, int year, String stileType) {
        super(vin, brand, model, year);
        this.stileType = stileType;
    }

    public String getStileType() {
        return stileType;
    }

    @Override
    void showInfo() {
        System.out.println("Moto:  VIN = " + getVin() + " " + getBrand() + " " + getModel() + " (" + getYear() + ")" + " " + getStileType());
    }
}
