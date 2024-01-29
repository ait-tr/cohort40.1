package lesson_05.code.lessoncode.createObjectWithConstructor;

public class Phone {

    String modelName;

    String simNumber;

    public Phone() {
    }

    public Phone(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "modelName='" + modelName + '\'' +
                ", simNumber='" + simNumber + '\'' +
                '}';
    }
}
