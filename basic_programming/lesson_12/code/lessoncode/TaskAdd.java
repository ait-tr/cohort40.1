package lesson_12.code.lessoncode;

import lesson_06.code.lessoncode.scanner.UserInput;

public class TaskAdd {
    /*
   Напечатать все простые числа от 2 до 100
     */

    public static void main(String[] args) {

        SimpleNumber simpleNumber = new SimpleNumber();

        for (int i = 2; i < 100; i++) {
            if (simpleNumber.isSimple(i)) {
                System.out.println("Число " + i + " простое");
            }
        }



    }

}
