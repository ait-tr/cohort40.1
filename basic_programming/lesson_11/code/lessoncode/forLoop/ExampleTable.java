package lesson_11.code.lessoncode.forLoop;

public class ExampleTable {
    public static void main(String[] args) {
        System.out.println( "     1    2    3    4    5    6    7    8    9    10");
        System.out.println("---------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i +"  ");
            for (int j = 1; j <= 10 ; j++) {

                System.out.print(" |  "+i*j);
            }
            System.out.println();
        }

    }
}
