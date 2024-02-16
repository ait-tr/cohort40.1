package lesson_24.code.lessoncode.arrayWithOutInterfaces;

abstract class Device {

    String name;
    String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    abstract void switchON();
    abstract void switchOFF();

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
