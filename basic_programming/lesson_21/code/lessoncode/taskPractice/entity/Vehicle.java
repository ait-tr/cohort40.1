package lesson_21.code.lessoncode.taskPractice.entity;

abstract class Vehicle {

    private String model;
    private Integer speed;

    abstract void accelerate();
    abstract void brake();

    public Vehicle(String model, Integer speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
