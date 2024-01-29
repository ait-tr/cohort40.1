package lesson_05.code.lessoncode.carExample;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.producer = "Volvo";
        myCar1.model = "S80";
        myCar1.maxSpeed = 280;
        myCar1.engine = " 2493 см куб";

        Car myCar2 = new Car();
        myCar2.producer = "Jaguar";
        myCar2.model = "F-Type";
        myCar2.maxSpeed = 260;

        myCar1.signal();
        myCar2.signal();

        myCar1.engineStart("Начнем нашу поездку");
        myCar1.engineStop();

    }
}
