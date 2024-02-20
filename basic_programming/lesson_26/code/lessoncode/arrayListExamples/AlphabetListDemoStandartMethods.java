package lesson_26.code.lessoncode.arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabetListDemoStandartMethods {
    public static void main(String[] args) {
        // Создадим ArrayList для хранения букв
        ArrayList<String> alphabet = new ArrayList<>();

        // добавим буквы в коллекцию
        for (char letter = 'А'; letter <= 'Я'; letter++) {
            alphabet.add(String.valueOf(letter));
        }

        // выведем нашу коллекцию в прямом порядке
       printList(alphabet);

        // выведем алфавит в обратном порядке


        Collections.reverse(alphabet);

        printList(alphabet);

        Collections.sort(alphabet);

        printList(alphabet);


    }

    private static void printList(ArrayList<String> alphabet){
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.print(alphabet.get(i) + ", ");
        }
    }



}
