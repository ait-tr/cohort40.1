package lesson_04.code.lessoncode.classConstructor;

public class CarDemo {

    public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.printCarData();

        myFirstCar.producer = "Mercedes";
        myFirstCar.model = "GLC 250";
        myFirstCar.maxSpeed = 280;

        myFirstCar.printCarData();

        Car mySecondCar = new Car();

        mySecondCar.producer = "BMW";
        mySecondCar.model = "M5";
        mySecondCar.maxSpeed = 320;

        mySecondCar.printCarData();

        Car myCarWithConstructor = new Car("Volvo", "S80", 260);
        myCarWithConstructor.printCarData();

    }

}

