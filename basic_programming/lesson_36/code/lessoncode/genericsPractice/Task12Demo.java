package lesson_36.code.lessoncode.genericsPractice;

public class Task12Demo {
    public static void main(String[] args) {


        Task12<Integer, String> test21demo = new Task12<>(25,"Generics");
        test21demo.print();

        Task12<String, Integer> test22demo = new Task12<>("James Bond", 7);
        test22demo.print();
    }
}
