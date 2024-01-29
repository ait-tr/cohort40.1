package lesson_06.code.lessoncode.publicAndPrivet.car;


import lesson_06.code.lessoncode.publicAndPrivet.car.entiry.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Mercedes");

        car.model = "GLC 250";
        car.color = "Black";

        System.out.println(car.getProducer());

    }
}
