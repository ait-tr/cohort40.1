package lesson_38.code.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

       // Collections.sort(myList);

       // System.out.println(myList);

        // Step 1

//        StringLengthComparator comparator = new StringLengthComparator();
//        Collections.sort(myList,comparator);
//        System.out.println(myList);

//        // Step 2
//
//        Collections.sort(myList,new StringLengthComparator());
//        System.out.println(myList);

        // Step 3

        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };


        Collections.sort(myList,myComparator);
        System.out.println(myList);


    }
}
