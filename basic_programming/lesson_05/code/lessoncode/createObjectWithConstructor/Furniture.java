package lesson_05.code.lessoncode.createObjectWithConstructor;

public class Furniture {

    String type;

    String color;

    String material;

    public Furniture(String type) {
        this.type = type;
    }

    public Furniture(String type, String material ) {
        this.type = type;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
