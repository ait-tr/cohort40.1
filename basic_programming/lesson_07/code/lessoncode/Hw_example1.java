package lesson_07.code.lessoncode;

public class Hw_example1 {
    /*

    Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.

для этого: взять первое слово, найти его длину, вычислить индекс его середины и получить подстроку которая начинается с 0 индекса и до середины
затем, взять второе слово, найти его длину, вычислить индекс его середины и получить подстроку которая начинается с середины и до конца


Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.

если букв 4 то 2 + 2 ( от 0 индекса до 2) 4 / 2 = 2
если букв 5 то 2 + 1 + 2 (от 0 индекса до 2) 5 / 2 = 2.5

в формуле вычисления середины - округлить вниз для первого слова или округлить вверх для второго слова



Распечатать на консоль.
1 Еще раз запросите у пользователя строку
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().

     */

    public static void main(String[] args) {

        InputText sourceText = new InputText();

        String word1 = sourceText.inputTextFromKeyboard("Please enter word # 1:");
        String word2 = sourceText.inputTextFromKeyboard("Please enter word # 2:");

        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);

        int firstWordLength = word1.length();
        int secondWordLength = word2.length();

        int middleIndexFirstWord = firstWordLength / 2 ;


        int middleIndexSecondWord = (int) Math.ceil(secondWordLength / 2.0);
        /*
        Исходя из задания, например

        "01234567" - длина слова 8 символов
        серединный индекс = 8 / 2 = 4
        то есть при вызове метода substring(0,4) мы получим результат "0123"


       но если мы вызываем substring(4,8) мы получим результат "4567"

       Для нечетного количества символов
        "012345678" - длина слова 9 символов
        серединный индекс = (int) (9 / 2) = 4

        то есть при вызове метода substring(0,4) мы получим результат "0123"

       но если мы вызываем substring(5,9) мы получим результат "45678"
         */

        System.out.println(middleIndexFirstWord);
        System.out.println(middleIndexSecondWord);

        // получаем подстроки

        String firstPart = word1.substring(0,middleIndexFirstWord);
        String secondPart = word2.substring(middleIndexSecondWord);

        // соединяем строки

        String mergeWord = firstPart + secondPart;

        System.out.println("Результат слияния: " + mergeWord) ;

        System.out.println("====================");
        System.out.println("Вторая часть задания");

        /*
        1 Еще раз запросите у пользователя строку
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
(5 Заменить все символы “а” на “о”.)
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().
         */

        MethodsForWorkWithString methods = new MethodsForWorkWithString();

        String textLine = sourceText.inputTextFromKeyboard("Введите строку текста:");

        methods.lastLineSymbol(textLine);






    }
}
