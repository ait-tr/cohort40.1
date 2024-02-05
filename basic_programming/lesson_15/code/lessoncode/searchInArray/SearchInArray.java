package lesson_15.code.lessoncode.searchInArray;

public class SearchInArray {

    public int linearSearch(int[] workingArray, int searchElement) {
        for (int index = 0; index < workingArray.length; index++) {
            if (workingArray[index] == searchElement) {
                return index;
            }
        }
        return -1;
    }

    public int binarySearch(int[] workingArray, int searchElement) {
        int leftIndex = 0;
        int rightIndex = workingArray.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (rightIndex - leftIndex) / 2;

            // если середина - это наш искомый элемент
            if (workingArray[middleIndex] == searchElement) {
                return middleIndex;
            }

            // проверяем какую (левую или правую ) часть массива выбрать для продолжения поиска

            if (workingArray[middleIndex] < searchElement) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
            return -1;
    }

}
