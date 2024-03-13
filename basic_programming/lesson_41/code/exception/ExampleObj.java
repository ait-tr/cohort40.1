package lesson_41.code.exception;

import java.util.ArrayList;
import java.util.List;

public class ExampleObj {
    public static void main(String[] args) {

        try {
            printMe(createList(0));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("откуда-то взялась арифметическая ошибка");
        }
        System.out.println("Program finished successfully");

    }

    static List<String> createList(int counter){
        List<String> fruits = null;
        if (counter > 0) {
            fruits = new ArrayList<>();

            for (int i = 0; i < counter; i++) {
                fruits.add("Fruit # " + i);
            }
        }
        return fruits;
    }

    static void printMe(List<String> fruits){

        int x = 10 / 0;

        if (fruits == null) {
            throw new NullPointerException("коллекция фруктов не инициализирована!");
        }

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }

}
