package lesson_21.code.lessoncode.taskPractice.entity.vehicals;

import lesson_21.code.lessoncode.taskPractice.entity.Engine;
import lesson_21.code.lessoncode.taskPractice.entity.GearShift;
import lesson_21.code.lessoncode.taskPractice.entity.MotorizedVehicle;

public class Moto extends MotorizedVehicle {
    public Moto(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }
}
