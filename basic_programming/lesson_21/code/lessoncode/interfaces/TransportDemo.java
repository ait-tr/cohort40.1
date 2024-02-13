package lesson_21.code.lessoncode.interfaces;

public class TransportDemo {
    public static void main(String[] args) {
        NormalCar normalCar = new NormalCar();
        MotoBmw motoBmw = new MotoBmw();
        Bycicle bycicle = new Bycicle();
        Pedestrian pedestrian = new Pedestrian();


        TransportVehicle[] transportVehicles = {normalCar, motoBmw, bycicle};

        for (int i = 0; i < transportVehicles.length; i++) {
            transportVehicles[i].speedUp();
        }


        Moving[] movingObjects = {normalCar, motoBmw, bycicle, pedestrian};

        for (int i = 0; i < movingObjects.length; i++) {
            movingObjects[i].movement();
        }

    }
}
