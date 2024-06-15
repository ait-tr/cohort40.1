package code.HW39;

public class Task1 {
    public static void main(String[] args) {
        T1 example1 = (text) -> text.toUpperCase();
        System.out.println(example1.UpperText("hi"));
    }
}
@FunctionalInterface
interface T1 {
    String UpperText(String text);
}
