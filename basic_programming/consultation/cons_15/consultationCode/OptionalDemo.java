package consultation.cons_15.consultationCode;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(null);

        optionalString.ifPresentOrElse(
                value -> System.out.println("Значение присутствует: " + value),
                () -> System.out.println("Значение отсутствует!")
        );
    }
}
