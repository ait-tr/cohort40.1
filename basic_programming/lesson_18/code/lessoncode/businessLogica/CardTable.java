package lesson_18.code.lessoncode.businessLogica;

import lesson_06.code.lessoncode.scanner.UserInput;
import lesson_18.code.lessoncode.entity.Card;
import lesson_18.code.lessoncode.entity.CardDeck;
import lesson_18.code.lessoncode.entity.Player;
import lesson_18.code.lessoncode.service.CardTableService;
import lesson_18.code.lessoncode.service.DeckService;
import lesson_18.code.lessoncode.service.PrintService;

public class CardTable {

    CardDeck cardDeck = new CardDeck();

    DeckService service = new DeckService();

    CardTableService tableService = new CardTableService();

    PrintService printService = new PrintService();

    UserInput userInput = new UserInput();

    Player[] players;


    public void game(){

        service.fillDeck(cardDeck.getDeck());

        printService.printDeck(cardDeck.getDeck(), "Печать оригинальной колоды карт");

        Card[] deckShuffle = service.deckShuffle(cardDeck.getDeck());
        printService.printDeck(deckShuffle, "Печать перемешенной колоды карт");

        int numberPlayers = userInput.inputInteger("введите количество игроков: ");

        players= new Player[numberPlayers];

        tableService.createPlayers(players);

        tableService.dealCards(deckShuffle, 5,players);

        printService.printPlayers(players);

        printService.printDeck(deckShuffle,"колода карт после раздачи игрокам");

        tableService.removeCardsFromDeck(deckShuffle,5, players.length);

        printService.printDeck(deckShuffle,"колода карт после раздачи и удаления карт из колоды");


        System.out.println("ПОСМОТРИМ ЕЩЕ РАЗ НА КАРТЫ ИГРОКОВ!");

        printService.printPlayers(players);

        printService.printDeck(cardDeck.getDeck(), "первоначальная колода");


    }


}
