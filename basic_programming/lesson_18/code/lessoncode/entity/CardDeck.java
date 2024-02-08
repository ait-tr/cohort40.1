package lesson_18.code.lessoncode.entity;

/*
создаем массив из элементов - экземпляров класса Card
в каждой ячейке этого массива будет хранится ссылка
на элемент - экземпляр класса Card
у которого есть две переменные (два поля) - value и suit
 */
public class CardDeck {

    private Card[] deck = new Card[52];

    private Card[] deckShuffle = new Card[52];

    public Card[] getDeck() {
        return deck;
    }

    public Card[] getDeckShuffle() {
        return deckShuffle;
    }
}
