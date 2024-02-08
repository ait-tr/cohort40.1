package lesson_18.code.lessoncode.service;

import lesson_18.code.lessoncode.entity.Card;

public class DeckService {


    public void fillDeck(Card[] deck){

//        Card card1 = new Card("2","♠️");
//        Card card2 = new Card("2","♣️");
//        Card card3 = new Card("2","♦️");
//        Card card4 = new Card("2","♥️");

        String[] cardValue = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cardSuit = {"♠️","♣️","♦️","♥️"};

        int counter = 0;

        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                deck[counter] = new Card(cardValue[i],cardSuit[j]);
                counter++;
            }
        }
    }


    public Card[] deckShuffle(Card[] deck){
        Card[] deckShuffle = deck.clone();

        // .clone() осуществляет КОПИРОВАНИЕ значений из одного массива в другой
        // если элемент массива - это примитивные типы, то копируется значения
        // если элемент массива - ссылка, то копируется ссылка
        // НО НЕ СОЗДАЕТСЯ ДУБЛИКАТ ОБЪЕКТА на который ссылка указывает


        //        for (int i = 0; i < deck.length; i++) {
        //            deckShuffle[i] = deck[i];
        //        }

        // используем алгоритм Фишера-Йетса
        // суть - проходим в обратном порядке по массиву
        // берем очередной элемент справа
        // из оставшихся элементов слева находим случайный индекс
        // и меняем элемент с этим случайным индексом с нашим i-ым элементом
        // и переходим к следующему

        for (int i = deckShuffle.length - 1; i > 0 ; i--) {
            int randomIndex = (int) (Math.random() * i);

            /*
            в нашем случае массив от [0; 51]

            берем правый элемент - № 51
            находим случайное значение в диапазоне от 0 до 50
            например 27 и меняем 27 элемент с 51

            далее берем 50 элемент
            находим случайное значение в диапазоне от 0 до 49
            например 13 и меняем 13 элемент с 50

            ...

            когда мы дойдем до элемента 27
             */

            Card tempCard = deckShuffle[i];
            deckShuffle[i] = deckShuffle[randomIndex];
            deckShuffle[randomIndex] = tempCard;
        }

        return deckShuffle;
    }

}
