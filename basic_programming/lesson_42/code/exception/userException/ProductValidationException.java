package lesson_42.code.exception.userException;

public class ProductValidationException extends RuntimeException{
    public ProductValidationException(String message) {
        super(message);
    }
}