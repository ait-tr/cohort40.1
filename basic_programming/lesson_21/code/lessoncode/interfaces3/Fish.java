package lesson_21.code.lessoncode.interfaces3;

public class Fish implements Swimming{
    @Override
    public void swim() {
        System.out.println("Плыви рыбка большая и маленькая!");
    }
}
