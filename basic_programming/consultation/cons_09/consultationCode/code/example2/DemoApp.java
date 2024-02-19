package consultation.cons_09.consultationCode.code.example2;

public class DemoApp {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "G500");
        Moto moto = new Moto("BMW", "K 1600 GTL");
        Bicycle bicycle = new Bicycle("Specialized", 7);
        Yacht yacht = new Yacht("SuperYacht", 42);

        Vehicle[] vehicles = {car, moto, bicycle, yacht};

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getManufacture());
        }

        SpecialSignal[] specialSignalsVehicles = {car, moto, yacht};

        for (int i = 0; i < specialSignalsVehicles.length; i++) {
            specialSignalsVehicles[i].signal();
        }

    }
}
