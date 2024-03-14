package lesson_42.code.exception.userException;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.InputMismatchException;

public class ShopListApp {
    public static void main(String[] args) {
        ValidationServiceWithException validationService = new ValidationServiceWithException();
        ProductServiceWithException productService = new ProductServiceWithException(validationService);
        UserInput ui = new UserInput();

        while (true) {
            try {
                System.out.println("Введите данные нового продукта: ");
                String name = ui.inputText("Введите название продукта: ");
                Double price = ui.inputDouble("Введите цену продукта: ");

                Product newProduct = new Product(name, price);
                productService.add(newProduct);
            } catch (NumberFormatException e){
                System.out.println("Incorrect number entered");
            } catch (InputMismatchException e){
                System.out.println("Incorrect input type entered");
            } catch (ProductValidationException exception) {
                System.out.println("Product data validation failed!");
                System.out.println(exception.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finally block!");
            }

        }


    }
}
