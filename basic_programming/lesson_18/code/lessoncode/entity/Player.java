package lesson_18.code.lessoncode.entity;

import java.util.Arrays;

public class Player {
    private String name;
    private Card[] playerCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card[] getPlayerCards() {
        return playerCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerCards=" + Arrays.toString(playerCards) +
                '}';
    }
}
