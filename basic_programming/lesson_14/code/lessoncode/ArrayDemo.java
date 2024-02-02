package lesson_14.code.lessoncode;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        1) получить длину массива от пользователя
        2) создание массива нужной длины
        3) получить интервал от пользователя
        4) заполнить массив случайными числами в определенном интервале
        5) вывести информацию о массиве на экран
         */


//1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
        int[] myRandomArray = new int[5];

        //с пом. цикла, пока индекс массива не достигнет нужной величины(5), повторяй
        for (int i = 0; i < myRandomArray.length; i++) {
            //генерируй
            int min = 10;
            int max = 99; //в условии до 99 вкл., а рандом считает до... не вкл., поэтому до (99+1)
            // Генерация случайного целого числа в заданном диапазоне.
            myRandomArray[i] = (int) (Math.random() * (max - min + 1) + min); //для масштабирования
        }
}
}
