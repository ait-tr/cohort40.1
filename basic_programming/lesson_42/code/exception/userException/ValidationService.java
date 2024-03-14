package lesson_42.code.exception.userException;

import java.util.Objects;

public class ValidationService implements Validation{

    /*
   проверка на:
   - продукт name не null
   - длина названия продукта не менее 3 символов
   - название состоит не из пробелов
   - цена не null
   - цена продукта должна быть > 0
    */


    @Override
    public String validate(Product product) {
        if (product.getName() == null) {
            return "Product name is null";
        }
        if (product.getName().equals("")) {
            return "Product name is empty";
        }
        if (product.getName().length() < 3) {
            return "Product name length less than 3";
        }
        if (product.getName().isBlank()) {
            return "Product name is blank";
        }
        if (product.getPrice() == null) {
            return "Product price is null";
        }
        if (product.getPrice() <= 0) {
            return "Product price less than 0";
        }
        return "Ok";
    }


}
