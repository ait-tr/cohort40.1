package lesson_43.code.exception.userException;

import lesson_42.code.exception.userException.Product;

import java.util.List;

public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
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
