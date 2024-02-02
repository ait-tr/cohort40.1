package lesson_14.code.lessoncode.arrayInt;

public class ArrayDemoWithMethods {
    public static void main(String[] args) {
         /*
        1) получить длину массива от пользователя
        2) создание массива нужной длины
        3) получить интервал от пользователя
        4) заполнить массив случайными числами в определенном интервале
        5) вывести информацию о массиве на экран
         */


        // создаем экземпляры нужных нам классов чтобы иметь
        // возможность воспользоваться методами которые в них есть

        ArrayService service = new ArrayService();
        UserInput userInput = new UserInput();

        boolean isNotCorrectUserInput = true;

        int lengthForOurArray =0;

        while (isNotCorrectUserInput) {

            lengthForOurArray = userInput.inputInteger("Введите длину массива: ");

            if (lengthForOurArray > 0) {
                isNotCorrectUserInput = false;
            } else {
                System.out.println("Вы ввели некорректные данные");
            }
        }

        int[] myArray = service.createIntArray(lengthForOurArray);

        service.printArrayData(myArray);

        isNotCorrectUserInput = true;

        int intervalStart = 0;
        int intervalEnd = 0;

        while (isNotCorrectUserInput) {

            intervalStart = userInput.inputInteger("Введите начальное значение диапазона чисел: ");
            intervalEnd = userInput.inputInteger("Введите конечное значение диапазона чисел: ");

            if (intervalStart < intervalEnd) {
                isNotCorrectUserInput = false;
            } else {
                System.out.println("Вы ввели некорректные данные");
            }
        }


        service.fillArrayRandom(myArray,intervalStart,intervalEnd);

        service.printArrayData(myArray);

    }
}
