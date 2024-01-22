package carExample;

public class Car {
    public String model;
    public String producer;
    public int maxSpeed;
    public String engine;

     public void signal(){
        System.out.println("Автомобиль " + model + " сигналит! ");
    }

    public void engineStart(String message) {
        System.out.println(message);
        System.out.println("Автомобиль " + producer + " " + model + " включил двигатель");
    }

    public void engineStop() {
        System.out.println("Автомобиль " + producer + " " + model + " выключил двигатель");
    }


}
