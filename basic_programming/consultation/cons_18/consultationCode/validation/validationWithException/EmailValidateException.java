package consultation.cons_18.consultationCode.validation.validationWithException;


public class EmailValidateException extends RuntimeException {
    /*
    getMessage() - возвращает строку с коротким описание исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - Возвращает строковое представление объекта исключения
    printStackTract() - выводит трассировку стека исключения.
    */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception: " +  super.getMessage();
    }
}
