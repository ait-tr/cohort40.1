package lesson_44.code.applicationStructure.backEnd.entity;

public class Cat {

    private int catId;

    private String name;

    public Cat(int catId, String name) {
        this.catId = catId;
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public int getCatId() {
        return catId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catId=" + catId +
                ", name='" + name + '\'' +
                '}';
    }
}
