package code.HW41.Task7;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.LinkedHashMap;


public class Demo {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Apple", "Fruits", 2.0, 500));
        products.add(new Product("Mango", "Fruits", 22.0, 5));
        products.add(new Product("Dragon Fruit", "Fruits", 32.0, 10));
        products.add(new Product("Potato", "Vegetable", 2.3, 1500));
        products.add(new Product("Carrot", "Vegetable", 1.5, 600));
        products.add(new Product("M&M", "Candy", 1.99, 100));
        products.add(new Product("Oreo", "Candy", 2.5, 100));

        System.out.println("Enter the min amount in warehouse: ");
        Scanner scanner = new Scanner(System.in);
        Integer minNumber = scanner.nextInt();

        Map<String, Double> averageByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.filtering(p -> p.getAmountLeft() >= minNumber,
                                Collectors.averagingDouble(Product::getPrice))
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        averageByCategory.forEach((category, averagePrice) ->
                System.out.println("Category: " + category + ", Average Price: " + averagePrice)
        );
    }
}
