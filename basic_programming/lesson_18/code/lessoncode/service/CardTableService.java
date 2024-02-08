package lesson_18.code.lessoncode.service;


import lesson_18.code.lessoncode.entity.Card;
import lesson_18.code.lessoncode.entity.Player;

public class CardTableService {

    public void createPlayers(Player[] players){

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player # " + (i + 1));
        }
    }

    public void dealCards(Card[] deck, int numberCardForEachPlayer, Player[] players){
        int counter = 0;

        for (int i = 0; i < numberCardForEachPlayer; i++) {
            for (int j = 0; j < players.length; j++) {

                Card[] currentPlayerCards = players[j].getPlayerCards();
                currentPlayerCards[i] = deck[counter];
                counter++;
            }
        }
    }

    public void removeCardsFromDeck(Card[] deck, int numberCardForEachPlayer, int numberPlayers){
        int numberCardsForRemove = numberCardForEachPlayer * numberPlayers;

        for (int i = 0; i < numberCardsForRemove; i++) {
         deck[i].setSuit(".");
         deck[i].setValue(".");
        }
    }
}
