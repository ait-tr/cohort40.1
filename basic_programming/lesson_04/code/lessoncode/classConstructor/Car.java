package classConstructor;

public class Car {

    String model;

    String producer;

    int maxSpeed;

    public void printCarData(){
        System.out.println("Характеристики автомобиля:");
        System.out.println("Производитель: " + producer);
        System.out.println("Модель: " + model);
        System.out.println("Максимальная скорость: " + maxSpeed);
    }

}
