package lesson_40.code.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
       int[] arr = {50,60,70,80,90,100,110,120};

       // вывести числа больше или равно чем 90
        // при это каждое число увеличить на 10
        // из них взять только первые три

        int counter = 0;

        System.out.println("Делаем с помощью циклов: ");

        for (int x : arr){
            if (x >= 90) {
                x = x + 10;
                counter++;
                if (counter > 3) break;
                System.out.println(x);
            }
        }

        System.out.println();


        System.out.println("Делаем с помощью stream API: ");

        IntStream.of(50,60,70,80,90,100,110,120)
                .filter(x -> x >= 90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(x -> System.out.println(x));


    }
}
