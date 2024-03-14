package lesson_42.code.exception.userException;

import java.util.List;

public class ProductServiceWithException {

    private final ValidationServiceWithException validationService;

    public ProductServiceWithException(ValidationServiceWithException validationService) {
        this.validationService = validationService;
    }

    public void add(Product product) {

        validationService.validate(product);

        System.out.println("Success add new product");

    }
}
