package lesson_37.code;

import java.util.Optional;

public class IntegerOptional {

    public static Integer integerOptional(Optional<Integer> optNumber){
        if (optNumber.isPresent()) {
            return optNumber.get() * 2;
        } else {
            return null;
        }
    }
}
