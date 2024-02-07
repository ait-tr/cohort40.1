package lesson_17.code.lessoncode.practice;

import java.util.Arrays;

public class LotteryResult {

    public void checkLotteryResult(Lottery lottery, Player player){
        // провести проверку выигрышных номеров и сравнить с номерами в билетах игрока

        // получаем выигрышные номера лотереи
        int[] winnerNumbers = lottery.getWinnerNumbers();

        Arrays.sort(winnerNumbers);

        // Получить билеты от игрока

        LotteryTicket[] tickets = player.getTickets();

        System.out.println("Результат проверки для игрока: " + player.getIdCode());

       // проводим проверку КАЖДОГО билета

        for (int i = 0; i < tickets.length; i++) {
            // получили номера из текущего билета
            int[] numbersFromCurrentTicket = tickets[i].getTicketNumbers();

            int matchCounter = 0;
            // сравнить эти номера и выигрышные и сказать сколько совпадений

            for (int j = 0; j < numbersFromCurrentTicket.length; j++) {
                if (Arrays.binarySearch(winnerNumbers,numbersFromCurrentTicket[j]) >= 0) {
                    matchCounter++;
                }
            }
            // вывод количества совпадений в билете
            System.out.println("Ticket № " + (i + 1) + " have " + matchCounter + " winner numbers");
        }

    }
}
