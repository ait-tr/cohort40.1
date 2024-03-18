package consultation.cons_17.consultationCode;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalOrException {
    public static void main(String[] args) {
        List<String> strings = List.of("string1","string2","string3");

        Optional<String> result = strings.stream()
                .filter(str -> str.equals("string1"))
                .findFirst();

        System.out.println(result.orElseThrow(() -> new NotFoundException("Ваш элемент не найден")));
    }
}
