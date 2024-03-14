package lesson_42.code.exception.userException;

import java.util.ArrayList;
import java.util.List;
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
    public List<String> validate(Product product) {

        List<String> errorMessages = new ArrayList<>();

        if (product.getName() == null) {
            errorMessages.add("Product name is null");
        }
        if (product.getName().equals("")) {
            errorMessages.add("Product name is empty");
        }
        if (product.getName().length() < 3) {
            errorMessages.add("Product name length less than 3");
        }
        if (product.getName().isBlank()) {
            errorMessages.add("Product name is blank");
        }
        if (product.getPrice() == null) {
            errorMessages.add("Product price is null");
        }
        if (product.getPrice() <= 0) {
            errorMessages.add("Product price less than 0");
        }

//        if (errorMessages.isEmpty()) {
//            errorMessages.add("Ok");
//        }

        return errorMessages;
    }


}
