package lesson_42.code.exception.userException;

import lesson_06.code.lessoncode.scanner.UserInput;

public class ShopListApp {
    public static void main(String[] args) {
        Validation validationService = new ValidationService();
        ProductService productService = new ProductService(validationService);
        UserInput ui = new UserInput();

        while (true) {
            System.out.println("Введите данные нового продукта: ");
            String name = ui.inputText("Введите название продукта: ");
            Double price = ui.inputDouble("Введите цену продукта: ");

            Product newProduct = new Product(name,price);
            productService.add(newProduct);

        }


    }
}
