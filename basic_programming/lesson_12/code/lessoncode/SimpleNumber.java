package lesson_12.code.lessoncode;

public class SimpleNumber {

    public boolean isSimple(int checkNumber){

        for (int i = 2; i <= checkNumber / 2; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
