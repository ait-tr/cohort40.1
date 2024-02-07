package lesson_17.code.lessoncode.sort;

public class MergeDemo {
    public static void main(String[] args) {
       MergeSort mergeSortMethods = new MergeSort();

       int[] ourArray = {12,15,23,5,7,9,1};

        System.out.println("Наш исходный массив: ");
        for (int i = 0; i < ourArray.length; i++) {
            System.out.print(ourArray[i] + ", ");
        }

        System.out.println();


        System.out.println("--------------");
        System.out.println("Первый раз вызываем метод mergeSort с параметрами: ");
        System.out.println("левый индекс: " + 0);
        System.out.println("правый индекс: " + (ourArray.length - 1));


        mergeSortMethods.mergeSort(ourArray,0, ourArray.length - 1);

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < ourArray.length; i++) {
            System.out.print(ourArray[i] + ", ");
        }




    }
}
