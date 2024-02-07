package lesson_17.code.lessoncode.practice;

import java.util.Arrays;

public class Player {
    private String idCode;

    private LotteryTicket[] tickets;

    private int numberTickets;

    public Player(String idCode, int numberTickets) {
        this.idCode = idCode;
        this.numberTickets = numberTickets;
    }

    public String getIdCode() {
        return idCode;
    }

    public LotteryTicket[] getTickets() {
        return tickets;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public void buyAnfFillTickets(int sizeTicket, int sizeLotteryNumbers){
        tickets = new LotteryTicket[numberTickets];

        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new LotteryTicket();
            tickets[i].createAndFillTicket(sizeTicket,sizeLotteryNumbers);
            Arrays.sort(tickets[i].getTicketNumbers());
        }
    }

    public void printPlayerData(){
        System.out.println("Player ID: " + idCode);
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Билет № " + (i + 1));
            System.out.println(Arrays.toString(tickets[i].getTicketNumbers()));
        }
    }

}
