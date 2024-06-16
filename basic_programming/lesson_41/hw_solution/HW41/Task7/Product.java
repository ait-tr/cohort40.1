package code.HW41.Task7;

import java.util.Arrays;


public class Product {
    private String name;
    private String category;
    private Double price;
    private Integer amountLeft;

    public Product(String name, String category, Double price, Integer amountLeft) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.amountLeft = amountLeft;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getAmountLeft() {
        return amountLeft;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", amountLeft=" + amountLeft +
                '}';
    }
}
