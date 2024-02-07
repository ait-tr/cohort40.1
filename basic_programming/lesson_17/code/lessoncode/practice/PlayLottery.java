package lesson_17.code.lessoncode.practice;

public class PlayLottery {
    public static void main(String[] args) {
        int lotterySize = 36;
        int ticketSize = 5;


        Lottery lottery = new Lottery();
        lottery.createLotteryNumbers(lotterySize);
        lottery.shuffleNumbers();


        Player player1 = new Player("123-456-789",3);
        player1.buyAnfFillTickets(ticketSize,lotterySize);

        player1.printPlayerData();

        System.out.println("ПРОВОДИМ РОЗЫГРЫШ ЛОТЕРЕИ!");

        System.out.println("ВЫИГРЫШНЫЕ НОМЕРА:");
        lottery.getWinnerNumbers();
        lottery.printWinnerNumbers();



    }
}
