package lesson_29.code.lessoncode.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample4 {
    /*
    Написать программу, которая сравнивает две коллекции Set (множество, набор)
    и выводит на экран:
    - элементы, которые присутствуют ТОЛЬКО в первой коллекции;
    - элементы, которые присутствуют ТОЛЬКО во второй коллекции;
    - элементы, которые присутствуют в обеих коллекциях;
     */
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));


        Set<Integer> uniqSet1 = new HashSet<>(set1);
        Set<Integer> uniqSet2 = new HashSet<>(set2);
        Set<Integer> commonSet = new HashSet<>();

        for (Integer currentElement : set2){
            uniqSet1.remove(currentElement);
        }

        System.out.println(uniqSet1);


        for (Integer currentElement : set1){
            uniqSet2.remove(currentElement);
        }

        System.out.println(uniqSet2);

        for (Integer element : set1) {
            if (set2.contains(element)) {
                commonSet.add(element);
            }
        }

        System.out.println(commonSet);


        // вариант 2

        commonSet.clear();

        commonSet.addAll(set1);
        commonSet.addAll(set2);

        System.out.println(commonSet);

        commonSet.removeAll(uniqSet1);
        commonSet.removeAll(uniqSet2);

        System.out.println(commonSet);


        // ------- СТАНДАРТНЫЕ МЕТОДЫ ------

        uniqSet1.clear();
        uniqSet2.clear();
        commonSet.clear();

        System.out.println(uniqSet1);
        System.out.println(uniqSet2);
        System.out.println(commonSet);

        uniqSet1.addAll(set1);
        uniqSet1.removeAll(set2);

        uniqSet2.addAll(set2);
        uniqSet2.removeAll(set1);

        commonSet.addAll(set1);
        commonSet.retainAll(set2);


        System.out.println(uniqSet1);
        System.out.println(uniqSet2);
        System.out.println(commonSet);



    }
}
