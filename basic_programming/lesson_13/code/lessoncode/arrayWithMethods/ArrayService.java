package lesson_13.code.lessoncode.arrayWithMethods;

import lesson_06.code.lessoncode.scanner.UserInput;

public class ArrayService {

    public int[] createArray(){
        UserInput userInput = new UserInput();

        int lengthOurArray = userInput.inputInteger("введите длину массива");

        int[] workingArray = new int[lengthOurArray];

        return workingArray;

    }

    public void fillArray(int[] workingArray) {
        UserInput userInput = new UserInput();

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = userInput.inputInteger("Введите значение " + i + "-ого элемента массива");
        }
    }

    public int sumAllElements(int[] workingArray){
        int sumAllElements = 0;

        for (int i = 0; i < workingArray.length; i++) {
            sumAllElements += workingArray[i];
        }

        return sumAllElements;
    }

    public int findMax(int[] workingArray){
        int maxElementValue = workingArray[0];

        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] > maxElementValue) {
                maxElementValue = workingArray[i];
            }
        }

        return maxElementValue;
    }

    public int avgAllElements(int[] workingArray){
        int avg = sumAllElements(workingArray);

        return avg / workingArray.length;
    }

}
