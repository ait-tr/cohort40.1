package consultation.cons_18.consultationCode.validation;

public class ValidationEmailApp {
    public static void main(String[] args) {
        String email = "john@email.com";

        email = "john.email.com";
        email = "4john@email.com";
        email = "john@email.co.m";


        String validationResult = EmailValidator2.validate(email);

            if (validationResult.equals("Ошибки нет")) {
            System.out.println("Валидация пройден");
            } else {
                System.out.println("Ошибка валидации");
                System.out.println(validationResult);

            }


    }
}
