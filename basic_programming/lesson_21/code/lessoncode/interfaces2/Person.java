package lesson_21.code.lessoncode.interfaces2;

public class Person  implements Swimming {
    @Override
    public void swim() {
        System.out.println("Пловец кролем!");
    }
}
