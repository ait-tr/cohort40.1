package lesson_26.code.lessoncode.arrayListExamples;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        /*
        создать коллекцию телефонов
        показать что она создана и пустая
        добавить в нее один элемент
        показать что элемент добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один из элементов по индексу
        удалить один из элементов по объекту

         показать коллекцию

         */

        ArrayList<Phone> phones = new ArrayList<>();

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(1,"iPhone13 Max Pro", "Apple", 1250.00));

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(2,"iPhone14 Max Pro", "Apple", 1350.00));
        phones.add(new Phone(3,"iPhone15 Max Pro", "Apple", 1500.00));
        phones.add(new Phone(4,"Galaxy", "Samsung", 1100.00));


        System.out.println(phones);
        System.out.println(phones.size());

        System.out.println(phones.get(2));

        phones.remove(2);
        System.out.println(phones.get(2));
        System.out.println(phones);

    }
}
