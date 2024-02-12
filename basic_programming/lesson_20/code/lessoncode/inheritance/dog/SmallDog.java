package lesson_20.code.lessoncode.inheritance.dog;

public class SmallDog extends Dog{


    private boolean isVisitGroomer;

    public SmallDog(String name, String breed, boolean isVisitGroomer) {
        super(name, breed);
        this.isVisitGroomer = isVisitGroomer;
    }

    public void visitGroomer(){}

    public boolean isVisitGroomer() {
        return isVisitGroomer;
    }

    @Override
    public void voice(String message) {

        System.out.println("гав гав гав гав гав гав гав гав");
    }
}
