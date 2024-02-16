package lesson_24.code.lessoncode.arrayWithOutInterfaces;

public class Computer extends Device{

    int size;

    String processor;

    public Computer(String name, String description, int size, String processor) {
        super(name, description);
        this.size = size;
        this.processor = processor;
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
