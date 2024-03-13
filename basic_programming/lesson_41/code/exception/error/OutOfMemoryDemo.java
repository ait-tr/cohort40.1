package lesson_41.code.exception.error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<String[]> newList = new ArrayList<>();

        int count = 0;
        while (true){
            newList.add(newStringArray());
            count++;
            if (count % 100 == 0) {
                System.out.println(count);
            }
        }

    }

    static String[] newStringArray(){
        String[] newArray = new String[1_000_000];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = "zmm,vzm,xcvb z,mxcnvb `,mxncbv ,`mnbv ,m`ncvb ,`";
        }
        return newArray;
    }
}
