package lesson_25.code.lessoncode.staticExample;

public class Chair {

    static int chairCounter = 0;

    int id;

    String model;

    public Chair(int id, String model) {
        this.id = id;
        this.model = model;
        chairCounter++;
    }
}
