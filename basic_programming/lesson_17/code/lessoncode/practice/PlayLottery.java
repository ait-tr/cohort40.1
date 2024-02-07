package lesson_17.code.lessoncode.practice;

import lesson_06.code.lessoncode.scanner.UserInput;

public class PlayLottery {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();


        // создаем "константы" нашей лотереи: количество выигрышных номеров и размер лотереи
        int lotterySize = 36;
        int winnerSize = 5;

        // создать экземпляр класса в котором все методы про лотерею
        Lottery lottery = new Lottery();
        // создание лотерейных номеров
        lottery.createLotteryNumbers(lotterySize);
        // перемешивание номеров
        lottery.shuffleNumbers();


        int quantityPlayerTickets = userInput.inputInteger("Сколько билетов вы хотите купить? ");

        // создаем игрока с определенным количеством билетов
        Player player1 = new Player("123-456-789",quantityPlayerTickets);
        // в игроке мы создаем билеты (в каждом билете мы должны создать массив номеров этого билета ! номера внутри одного билета не должны повторяться)
        boolean isRandom = userInput.inputBoolean("Вы хотите купить с готовыми числами? (true / false) : ");
        player1.fillTickets(winnerSize,lotterySize,isRandom);

        player1.printPlayerData();

        System.out.println("ПРОВОДИМ РОЗЫГРЫШ ЛОТЕРЕИ!");

        //проводим розыгрыш, то есть просто из нашего "перемешанного" массива всех чисел берем первые 5-6-7 (сколько еам надо)
        lottery.lotteryRound(winnerSize);

        //печать результата
        System.out.println("ВЫИГРЫШНЫЕ НОМЕРА:");
        lottery.printWinnerNumbers();


        // проверка билетов игрока на наличие выигрышных номеров
        LotteryResult lotteryResult = new LotteryResult();
        lotteryResult.checkLotteryResult(lottery, player1);


    }
}
