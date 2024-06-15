package code.HW39;

public class Task2 {
    public static void main(String[] args) {
        sum1(45, 89);

    }

    private static void sum1(int a, int b) {
        sum sum1 =(x, y) -> x+y ;
        System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
    }
}
@FunctionalInterface
interface sum{
    int sum(int a, int b);
}