package lesson_42.code.exception.userException;

public class ProductService {

    private final Validation validationService;

    public ProductService(Validation validationService) {
        this.validationService = validationService;
    }

    public void add(Product product) {

        String validationResult = validationService.validate(product);

        if (validationResult.equals("Ok")) {
            System.out.println("Success add new product");
        } else {
            System.out.println(validationResult);
        }
    }

}
