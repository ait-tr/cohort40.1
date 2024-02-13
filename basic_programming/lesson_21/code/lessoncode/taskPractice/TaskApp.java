package lesson_21.code.lessoncode.taskPractice;

import lesson_21.code.lessoncode.taskPractice.entity.Engine;
import lesson_21.code.lessoncode.taskPractice.entity.GearShift;
import lesson_21.code.lessoncode.taskPractice.entity.vehicals.BiCycle;
import lesson_21.code.lessoncode.taskPractice.entity.vehicals.Car;
import lesson_21.code.lessoncode.taskPractice.entity.vehicals.Scooter;

public class TaskApp {
    public static void main(String[] args) {
        Car car = new Car("Mercedes S600 1998", 20, new Engine("V12 engine"), new GearShift("automatic 6 gear"));
        car.startEngine();
        car.accelerate();
        car.brake();
        car.brake();
        car.brake();
        car.stopEngine();


        Scooter scooter = new Scooter("noname", 25);
        scooter.accelerate();
        scooter.brake();
        scooter.brake();
        scooter.brake();
        scooter.brake();


        BiCycle biCycle = new BiCycle("SuperBike",20,new GearShift("gear 4"));
        biCycle.accelerate();
        biCycle.changeGear(true);
        biCycle.accelerate();
        biCycle.brake();
        biCycle.brake();
        biCycle.changeGear(false);
        biCycle.changeGear(false);
        biCycle.brake();
        biCycle.brake();




    }
}
