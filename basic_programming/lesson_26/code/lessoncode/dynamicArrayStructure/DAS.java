package lesson_26.code.lessoncode.dynamicArrayStructure;

import java.util.Arrays;

public class DAS {

    public String[] addNewElement(String[] workingArray, String newElement){

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == null) {
                workingArray[i] = newElement;
                return workingArray;
            }
        }

        String[] increasedArray = increaseArray(workingArray);

        increasedArray[workingArray.length] = newElement;


        return increasedArray;

    }

    private String[] increaseArray(String[] oldArray){
        String[] newArray = new String[oldArray.length * 2];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
}
