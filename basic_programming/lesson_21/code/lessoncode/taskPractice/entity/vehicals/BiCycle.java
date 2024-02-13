package lesson_21.code.lessoncode.taskPractice.entity.vehicals;

import lesson_21.code.lessoncode.taskPractice.entity.Engine;
import lesson_21.code.lessoncode.taskPractice.entity.GearShift;
import lesson_21.code.lessoncode.taskPractice.entity.NonMotorizedVehicle;
import lesson_21.code.lessoncode.taskPractice.interfaces.GearShiftOperations;

public class BiCycle extends NonMotorizedVehicle implements GearShiftOperations {
    private GearShift gearShift;

    public BiCycle(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);

    }

    @Override
    public void changeGear(boolean isUp) {
        Integer currentGear = gearShift.getCurrentGear();

        if (isUp) {
            gearShift.setCurrentGear(currentGear + 1);
        } else {
            gearShift.setCurrentGear(currentGear - 1);
        }
    }
}
