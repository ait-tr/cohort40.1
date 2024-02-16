package lesson_24.code.lessoncode.arrayWithOutInterfaces;

public class TV extends Device{

    int size;

    String technology;

    public TV(String name, String description, int size, String technology) {
        super(name, description);
        this.size = size;
        this.technology = technology;
    }

    @Override
    void switchON() {
        System.out.println("Наш TV включен");
    }

    @Override
    void switchOFF() {
        System.out.println("Наш TV выключен");
    }
}
