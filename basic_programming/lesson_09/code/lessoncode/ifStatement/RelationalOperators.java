package lesson_09.code.lessoncode.ifStatement;

public class RelationalOperators {
    public static void main(String[] args) {


        int x = 5;
        int y = 10;


        // равенство
        boolean isEqual = (x == y);

        System.out.println(isEqual);

        // не равенство
        boolean isNotEqual = (x != y);

        System.out.println(isNotEqual);

        // больше / меньше
        boolean greatherThan = (x > y);

        boolean lessThan = (x < y);

        System.out.println(greatherThan);
        System.out.println(lessThan);

        // больше или равно / меньше или равно
        boolean greatherOrEqualThan = (x >= y);

        boolean lessOrEqualThan = (x <= y);

        System.out.println(greatherOrEqualThan);
        System.out.println(lessOrEqualThan);





    }
}
