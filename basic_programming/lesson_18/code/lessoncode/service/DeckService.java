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

        // используем алгоритм Фишера-Йетса
        // суть - проходим в обратном порядке по массиву
        // берем очередной элемент справа
        // из оставшихся элементов слева находим случайный индекс
        // и меняем элемент с этим случайным индексом с нашим i-ым элементом
        // и переходим к следующему

        for (int i = deckShuffle.length - 1; i > 1 ; i--) {
            int randomIndex = (int) (Math.random() * i);

            Card tempCard = deckShuffle[i];
            deckShuffle[i] = deckShuffle[randomIndex];
            deckShuffle[randomIndex] = tempCard;
        }

        return deckShuffle;
    }

}
