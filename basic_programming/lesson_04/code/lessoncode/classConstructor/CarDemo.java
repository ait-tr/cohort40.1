package classConstructor;

public class CarDemo {

    public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.producer = "Mercedes";
        myFirstCar.model = "GLC 250";
        myFirstCar.maxSpeed = 280;

        myFirstCar.printCarData();

        Car mySecondCar = new Car();

        mySecondCar.producer = "BMW";
        mySecondCar.model = "M5";
        mySecondCar.maxSpeed = 320;

        mySecondCar.printCarData();

    }

}

