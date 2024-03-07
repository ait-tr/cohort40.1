package lesson_38.code.functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSotution {
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



//        // Step 3
//
//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//
//
//        Collections.sort(myList,myComparator);
//        System.out.println(myList);


//        // Step 4
//
//        Comparator<String> myComparator = (String o1, String o2) -> {
//                return o1.length() - o2.length();
//            };
//
//
//        Collections.sort(myList,myComparator);
//        System.out.println(myList);

        // Step 5


        Collections.sort(myList,(o1,o2) -> o1.length() - o2.length());

        System.out.println(myList);

        Collections.sort(myList,(o1,o2) -> o2.length() - o1.length());

        System.out.println(myList);
    }
}
