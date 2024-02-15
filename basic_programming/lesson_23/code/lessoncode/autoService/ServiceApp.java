package lesson_23.code.lessoncode.autoService;

public class ServiceApp {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();

        Car car = new Car("1GHJGJGFH65465JGVJ", "Honda", "Civic", 2020);
        Truck truck = new Truck("2JGKJ67865HJGHJG", "Ford", "F-150", 2010);

        manager.addVehicle(car);
        manager.addVehicle(truck);

        manager.assignService(car, "Oil change");
        manager.assignService(truck,"Brake replacement");

        manager.printServiceStatus(0);

    }
}
