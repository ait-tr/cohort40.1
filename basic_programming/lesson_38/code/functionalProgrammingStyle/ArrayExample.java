package lesson_38.code.functionalProgrammingStyle;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(myArray));
        myArray = changeArray(myArray);
        //int[] newArray = changeArray(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    static int[] changeArray(int[] ourWorkingArray){
        int[] newArray = new int[ourWorkingArray.length];

        for (int i = 0; i < ourWorkingArray.length ; i++) {
            if (ourWorkingArray[i] % 2 == 0 ) {
                newArray[i] = 0;
            } else {
                newArray[i] = ourWorkingArray[i];
            }
        }

        return newArray;
    }
}
