package lesson_15.code.lessoncode.searchInArray;

public class SearchInArray {

    public int linearSearch(int[] workingArray, int searchElement){
        for (int index = 0; index < workingArray.length; index++) {
            if (workingArray[index] == searchElement) {
               return index;
            }
        }
        return -1;
    }
}
