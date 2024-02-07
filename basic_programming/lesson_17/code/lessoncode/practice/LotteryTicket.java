package lesson_17.code.lessoncode.practice;

import java.util.Random;

public class LotteryTicket {
    private int[] ticketNumbers;

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }

    public void createAndFillTicket(int sizeTicket, int sizeLotteryNumbers){
        ticketNumbers = new int[sizeTicket];
        fillTicket(sizeLotteryNumbers);
    }

    private void fillTicket(int sizeLotteryNumbers){
        Random random = new Random();

        for (int i = 0; i < ticketNumbers.length; i++) {

            boolean isNotFillCurrentNumber = true;

            while (isNotFillCurrentNumber) {
                int currentRandomValue = random.nextInt(sizeLotteryNumbers + 1);

                if (isRandomNumberNotRepeate(currentRandomValue)) {
                    ticketNumbers[i] = currentRandomValue;
                    isNotFillCurrentNumber = false;
                }
            }
        }
    }

    private boolean isRandomNumberNotRepeate(int checkNumber){
        for (int i = 0; i < ticketNumbers.length; i++) {
            if (ticketNumbers[i] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}
