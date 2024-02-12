package lesson_20.code.lessoncode.abstraction;

public class CarDemo {
    public static void main(String[] args) {

        SedanCar sedan1 = new SedanCar("Ford");
        SedanCar sedan2 = new SedanCar("Honda");
        SedanCar sedan3 = new SedanCar("Mitsubishi");

        SportCar sportCar1 = new SportCar("Maserati");
        SportCar sportCar2 = new SportCar("Lamborghini");
        SportCar sportCar3 = new SportCar("BMW M5");

        TruckCar truckCar1 = new TruckCar("VOLVO");
        TruckCar truckCar2 = new TruckCar("MAN");
        TruckCar truckCar3 = new TruckCar("SCAN");

       //  Car car = new Car("MyCar"); - НЕВОЗМОЖДНО СОЗДАТЬ ЭКЗЕМПЛЯР КЛАССА ОТ АБСТРАКТНОГО


        Car[] cars = {sedan1,sedan2,sedan3,sportCar1,sportCar2,sportCar3,truckCar1,truckCar2,truckCar3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].getModel();
            cars[i].beep();
            cars[i].speedUp();
        }



    }
}
