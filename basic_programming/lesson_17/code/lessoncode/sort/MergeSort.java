package lesson_17.code.lessoncode.sort;

public class MergeSort {

    int reqursStep = 0;

    public  void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // создадим временные массивы
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // скопируем данные во временные массивы
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // соединяем временные массивы

        // инициализируем индексы первого и второго подмассива
        int i = 0;
        int j = 0;

        // создаем индекс для объединенного подмассива
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                        i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // скопируем оставшие элементы из левого массива если они есть

        while (i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // скопируем оставшие элементы из правого массива если они есть

        while (j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr, int left, int right){
        System.out.println();
        reqursStep++;
        System.out.println("Шаг рекурсии " + reqursStep);
        if (left < right) {
            // найдем середину

            int middle = (left + right) / 2;

            // отсортируем обе половинки

            System.out.println("--------------");
            System.out.println("Вызываем метод mergeSort с параметрами: ");
            System.out.println("левый индекс: " + left);
            System.out.println("правый индекс: " + middle);

            mergeSort(arr, left, middle);

            System.out.println("--------------");
            System.out.println("Вызываем метод mergeSort с параметрами: ");
            System.out.println("левый индекс: " + (middle + 1));
            System.out.println("правый индекс: " + right);
            mergeSort(arr, middle + 1, right);

            // соединяем

            System.out.println("--------------");
            System.out.println("           Вызываем метод merge с параметрами: ");
            System.out.println("           левый индекс: " + left);
            System.out.println("           середина индекс: " + middle);
            System.out.println("           правый индекс: " + right);
            merge(arr,left,middle,right);
        }
    }
}
