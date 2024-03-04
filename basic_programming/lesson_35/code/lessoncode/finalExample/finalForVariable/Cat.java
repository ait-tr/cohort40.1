package lesson_35.code.lessoncode.finalExample.finalForVariable;

public class Cat {

    private String name;

    // чтобы запретить изменения поля можно использовать final
    // private final String name;


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
