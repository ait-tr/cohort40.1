package lesson_20.code.lessoncode.abstraction.animal;

public class Fish extends Animal{

    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }


    @Override
    void breath() {
        System.out.println("Gills");
    }
}
