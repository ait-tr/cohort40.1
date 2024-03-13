package lesson_41.code.exception;

public class FinallyExample {
    public static void main(String[] args) {
        int number = getNumber();
        System.out.println(number);
    }

    private static int getNumber() {
        int x = 0;
        try {
            x = x + 10 ;
        } catch (Exception e){
            return 2;
        } finally {
            return x;
        }
    }
}
