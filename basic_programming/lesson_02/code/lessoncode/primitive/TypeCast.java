package lesson_02.code.lessoncode.primitive;

public class TypeCast {
    public static void main(String[] args) {
        int x = 10;
        double xDouble = x;
        // это равносильно
        double x2Double = (double) x;

        System.out.println(x);
        System.out.println(xDouble);


        double yDouble = 10.9;

        int y = (int) yDouble;

        System.out.println(y);


        yDouble = 3456437457451.9;
        y = (int) yDouble;

        System.out.println(y);


        xDouble = 0.2;
        yDouble = 0.1;
        double f = xDouble - yDouble;

        System.out.println(f);

    }
}
