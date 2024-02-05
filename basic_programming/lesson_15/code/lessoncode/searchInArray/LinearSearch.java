package lesson_15.code.lessoncode.searchInArray;

public class LinearSearch {
    public static void main(String[] args) {

        SearchInArray search = new SearchInArray();

        int[] arrayForSearch = {8,3,5,2,1,4,7,6};

        int elementForSearch = 5;

        int indexSearch = search.linearSearch(arrayForSearch,elementForSearch);

        if (indexSearch >= 0) {
            System.out.println("Search element " + elementForSearch + " have index " + indexSearch);
        } else {
            System.out.println("Search element " + elementForSearch + " not found ");

        }

    }
}
