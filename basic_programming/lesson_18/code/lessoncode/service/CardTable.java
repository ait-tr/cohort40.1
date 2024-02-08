package lesson_18.code.lessoncode.service;

import lesson_18.code.lessoncode.entity.CardDeck;

import java.util.Arrays;

public class CardTable {

    CardDeck cardDeck = new CardDeck();

    DeckService service = new DeckService();

    public void game(){

        service.fillDeck(cardDeck.getDeck());

        System.out.println(Arrays.toString(cardDeck.getDeck()));
    }


}
