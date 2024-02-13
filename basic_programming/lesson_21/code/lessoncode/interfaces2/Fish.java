package lesson_21.code.lessoncode.interfaces2;

public class Fish implements Swimming{
    @Override
    public void swim() {
        System.out.println("Плыви рыбка большая и маленькая!");
    }
}
