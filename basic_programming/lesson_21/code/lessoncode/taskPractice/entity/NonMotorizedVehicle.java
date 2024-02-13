package lesson_21.code.lessoncode.taskPractice.entity;

import lesson_21.code.lessoncode.taskPractice.interfaces.EngineOperations;
import lesson_21.code.lessoncode.taskPractice.interfaces.GearShiftOperations;

public class NonMotorizedVehicle extends Vehicle  {

    private Engine engine;
    private GearShift gearShift;

    public NonMotorizedVehicle(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed);
        this.engine = engine;
        this.gearShift = gearShift;
    }

    @Override
    void accelerate() {
        setSpeed(getSpeed() + 10);
        System.out.println("Accelerate. Current speed: " + getSpeed());
    }

    @Override
    void brake() {
        if (getSpeed() > 10) {
            setSpeed(getSpeed() - 10);
            System.out.println("Brake. Current speed: " + getSpeed());
        } else {
            setSpeed(0);
            System.out.println(getModel() + " stopped");
        }
    }

}
