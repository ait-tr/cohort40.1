package lesson_39.code.standartFI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalFI {
    public static void main(String[] args) {
        Optional<Integer> optionalI = Optional.ofNullable(10);

        optionalI.ifPresent(value -> System.out.println("Значение = " + value));

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers.removeIf(collectionElement -> collectionElement % 2 == 0);

        System.out.println(integers);
    }
}
