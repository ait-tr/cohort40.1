package consultation.cons_16.consultationCode;

import java.util.List;

public class ProductUtil {

    public double calculateAvgPriceForCategory(List<Product> products, String category, int limit){

        double totalPrice = 0;
        int count = 0;

        for (Product product : products){
            if (product.getCategory().equals(category) && product.getQuantity() > limit) {
                totalPrice = totalPrice + product.getPrice();
                count++;
            }
        }
        return count > 0 ? totalPrice / count : 0;
    }
}
