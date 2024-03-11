package lesson_39.code.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        Task6Interface<Integer> combine = ((list1, list2) -> {
            List<Integer> resultList = new ArrayList<>(list1);
            resultList.addAll(list2);
            return resultList;
        });

        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(100, 200, 300);

        List<Integer> combineList = combine.combineList(list1,list2);


        System.out.println(combineList);

    }
}
