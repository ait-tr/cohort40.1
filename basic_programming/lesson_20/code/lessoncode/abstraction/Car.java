package lesson_20.code.lessoncode.abstraction;

public abstract class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        printModel();
        return model;
    }

    private void printModel(){
        System.out.println("Model name: " + model);
    }

    abstract void beep();

    abstract int speedUp();

}
