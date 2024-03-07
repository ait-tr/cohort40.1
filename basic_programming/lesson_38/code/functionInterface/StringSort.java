package lesson_38.code.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("DD");
        myList.add("FFF");
        myList.add("AAA");
        myList.add("CC");
        myList.add("BBBBBB");
        myList.add("E");
        myList.add("HHHHHHHHH");

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

        StringLengthComparator comparator = new StringLengthComparator();
        Collections.sort(myList,comparator);
        System.out.println(myList);
    }
}
