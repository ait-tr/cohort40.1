package consultation.cons_18.consultationCode.validation.validationWithException;

public class ValidationEmailApp {
    public static void main(String[] args) {
        String email = "john@email.com";

        email = "john.email.com";
        email = "4john@email.com";
        email = "john@email.co.m";

        try {
            EmailValidator.validate(email);
            System.out.println("Валидация пройден");

        } catch (EmailValidateException e) {
            System.out.println("Вы ввели не верные email");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("Завершение работы!");

    }
}
