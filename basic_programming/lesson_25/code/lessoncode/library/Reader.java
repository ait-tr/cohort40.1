package lesson_25.code.lessoncode.library;

class Reader {
    private String name;
    private int id;

    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
