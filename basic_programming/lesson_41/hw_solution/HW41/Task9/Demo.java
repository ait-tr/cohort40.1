package code.HW41.Task9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1", new Date(123, 1, 15),100.0, "Completed"));
        orders.add(new Order("2", new Date(123, 2, 30), 200.0, "Completed"));
        orders.add(new Order("3", new Date(123, 1, 15), 150.0, "Pending"));
        orders.add(new Order("4", new Date(123, 2, 15), 300.0, "Completed"));
        orders.add(new Order("5", new Date(123, 2, 15), 75.0, "Completed"));
        orders.add(new Order("6", new Date(123, 3, 15), 120.0, "Pending"));

        Map<String, Double> totalByMonth = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> new SimpleDateFormat("yyyy-MM").format(order.getDate()),
                        Collectors.summingDouble(Order::getSum)
                ));

        totalByMonth.forEach((month, total) ->
                System.out.println( month + "- Total: " + total)
        );
    }
}
