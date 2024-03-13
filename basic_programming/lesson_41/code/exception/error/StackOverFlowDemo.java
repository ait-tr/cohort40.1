package lesson_41.code.exception.error;

public class StackOverFlowDemo {
    public static void main(String[] args) {
        StackOverFlowDemo stack = new StackOverFlowDemo();

        int count = 0;
        stack.stackOn(count);

    }

    public void stackOn(int count){
        count++;
        System.out.print(count + "; ");
        stackOn(count);
    }
}
