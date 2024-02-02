package lesson_14.code.lessoncode.arrayObj;

public class Bicycle {

    private int id;
    private String model;
    private String type;
    private double price;

    public Bicycle(int id, String model, String type, double price) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
