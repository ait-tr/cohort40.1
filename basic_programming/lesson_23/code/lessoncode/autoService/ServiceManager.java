package lesson_23.code.lessoncode.autoService;

public class ServiceManager {
    // размер количества автомобилей на одновременном ремонте
    private Vehicle[] vehicles = new Vehicle[10];

    // размер работ
    private Serviceable[] serviceables = new Serviceable[10];

    private int vehicleCounter = 0;
    private int serviceCounter = 0;


    public void addVehicle(Vehicle vehicle){
        if (vehicleCounter < vehicles.length) {
            vehicles[vehicleCounter] = vehicle;
            vehicleCounter++;
            System.out.println("Vehicle added: ");
            vehicle.showInfo();
        } else {
            System.out.println("Service is full, cannot add more vehicles!");
        }
    }

    public void assignService(Vehicle vehicle, String workDescription){

        if (serviceCounter < serviceables.length) {

            if (workDescription.contains("repair")) {
                serviceables[serviceCounter] = new Repair(workDescription);
            }

            if (workDescription.contains("paint")) {
                serviceables[serviceCounter] = new Painted(workDescription);
            }

            serviceCounter++;

            System.out.println("Service started for " + vehicle.getBrand() + " " + vehicle.getModel() + " - " + workDescription);
        } else {
            System.out.println("Cannot assign more services, limit reached!");

        }
    }

    public void printServiceStatus(int orderNumber){
        System.out.println(serviceables[orderNumber].getWorkStatus());
    }

    public void changeServiceStatus(int orderNumber, String newStatus){
        serviceables[orderNumber].changeWorkStatus(newStatus);
    }


}
