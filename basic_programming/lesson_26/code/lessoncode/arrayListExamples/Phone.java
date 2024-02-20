package lesson_26.code.lessoncode.arrayListExamples;

import java.util.Objects;

public class Phone {
    private Integer id;
    private String model;
    private String producer;

    private Double price;

    public Phone(Integer id, String model, String producer, Double price) {
        this.id = id;
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id) && Objects.equals(model, phone.model) && Objects.equals(producer, phone.producer) && Objects.equals(price, phone.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, producer, price);
    }
}
