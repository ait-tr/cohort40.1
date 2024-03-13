package consultation.cons_16.consultationCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task7 {
    /*
    Дана коллекция Product - название, категория, цена, количество на складе.
   Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
   и отсортировать по убыванию цены
     */

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Product1","Category1", 100, 10));
        products.add(new Product("Product2","Category2", 200, 20));
        products.add(new Product("Product3","Category1", 50, 5));
        products.add(new Product("Product4","Category2", 30, 2));
        products.add(new Product("Product5","Category2", 500, 30));
        products.add(new Product("Product6","Category1", 300, 100));
        products.add(new Product("Product7","Category3", 150, 50));


        int limit = 10;

        Map<String, Double> avgPrices = products.stream()
                // отфильтровать продукті с количеством больше чем limit
                .filter(product -> product.getQuantity() > limit)
                .collect(Collectors.groupingBy(
                        product -> product.getCategory(),
                        Collectors.averagingDouble(product -> product.getPrice())
                ));

        System.out.println(avgPrices);


        Map<String, List<String>> categoryProduct = products.stream()
                // отфильтровать продукті с количеством больше чем limit
                .filter(product -> product.getQuantity() > limit)
                .collect(Collectors.groupingBy(
                        product -> product.getCategory(),
                        Collectors.mapping(product -> product.getName(), Collectors.toList())
                ));

       // System.out.println(categoryProduct);

        Map<String, List<Product>> categoryProductName = products.stream()
                // отфильтровать продукты с количеством больше чем limit
                .filter(product -> product.getQuantity() > limit)
                .collect(Collectors.groupingBy(
                        product -> product.getCategory() ));

       // System.out.println(categoryProductName);


        System.out.println("==============================");
        // сортировка по цене

        List<Map.Entry<String,Double>> sortedByAvgPrice = new ArrayList<>(avgPrices.entrySet());

        System.out.println(sortedByAvgPrice);
    }
}
