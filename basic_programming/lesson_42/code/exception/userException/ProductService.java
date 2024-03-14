package lesson_42.code.exception.userException;

import java.util.List;

public class ProductService {

    private final Validation validationService;

    public ProductService(Validation validationService) {
        this.validationService = validationService;
    }

    public void add(Product product) {

        List<String> validationResult = validationService.validate(product);

        if (validationResult.isEmpty()) {
            System.out.println("Success add new product");
        } else {
            System.out.println(validationResult);
        }
    }

}
