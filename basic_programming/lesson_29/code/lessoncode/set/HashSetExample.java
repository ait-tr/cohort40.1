package lesson_29.code.lessoncode.set;

import lesson_29.code.lessoncode.map.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();

        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        integers.add(1);
        integers.add(5);


        System.out.println(integers);


        Set<Car> cars = new HashSet<>();

        cars.add(new Car(1,"Mercedes", "G500"));
        cars.add(new Car(2,"BMW", "i8"));
        cars.add(new Car(3,"Audi", "S8"));
        cars.add(new Car(4,"Mercedes", "G500"));


        System.out.println(cars);

    }
}
