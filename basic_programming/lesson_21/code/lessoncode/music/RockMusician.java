package lesson_21.code.lessoncode.music;

public class RockMusician implements Musician{
    @Override
    public void greeting() {
        System.out.println("WooooooooW!");
    }

    @Override
    public void dance() {
        System.out.println("Dancing rock!");
    }

    @Override
    public void sing() {
        System.out.println("Singing rock");
    }
}
