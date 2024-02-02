package lesson_14.code.lessoncode.arrayObj;

import java.util.Arrays;

public class BicycleSalon {
    public static void main(String[] args) {

        // ------ создание велосипедов ------

        Bicycle bicycle1 = new Bicycle(1,"B1","CityType", 200);
        Bicycle bicycle2 = new Bicycle(2,"B1","MountainType", 220);
        Bicycle bicycle3 = new Bicycle(3,"B2","CityType", 300);
        Bicycle bicycle4 = new Bicycle(4,"B2","MountainType", 700);
        Bicycle bicycle5 = new Bicycle(5,"B3","CityType", 1000);
/////////////////////////////////////////////////////////////////////////////////

        Bicycle[] bicycles = {bicycle1,bicycle2,bicycle3,bicycle4,bicycle5};

        //System.out.println(Arrays.toString(bicycles));

        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Велосипед:");
            System.out.println("Номер каталога: " + bicycles[i].getId());
            System.out.println("Модель: " + bicycles[i].getModel());
            System.out.println("Тип: " + bicycles[i].getType());
            System.out.println("Цена: " + bicycles[i].getPrice());
            System.out.println("------------------------------");
        }


    }
}
