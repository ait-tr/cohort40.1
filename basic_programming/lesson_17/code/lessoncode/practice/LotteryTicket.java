package lesson_17.code.lessoncode.practice;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.Random;

public class LotteryTicket {
    private int[] ticketNumbers;

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }

    public void createAndFillTicket(int sizeTicket, int sizeLotteryNumbers, boolean isRandom){
        ticketNumbers = new int[sizeTicket];
        fillTicket(sizeLotteryNumbers, isRandom);
    }


    private boolean isRandomNumberNotRepeate(int checkNumber){
        for (int i = 0; i < ticketNumbers.length; i++) {
            if (ticketNumbers[i] == checkNumber) {
                return false;
            }
        }
        return true;
    }





    private void fillTicket(int sizeLotteryNumbers, boolean isRandom){

        Random random = new Random();
        UserInput userInput = new UserInput();


        for (int i = 0; i < ticketNumbers.length; i++) {

            boolean isNotFillCurrentNumber = true;
            int currentRandomValue = 0;

            while (isNotFillCurrentNumber) {

                if (isRandom) {
                    currentRandomValue = random.nextInt(sizeLotteryNumbers + 1);
                } else {
                    currentRandomValue = userInput.inputInteger("Введите " + i + " число вашего билет: ");
                }

                if (isRandomNumberNotRepeate(currentRandomValue)) {
                    ticketNumbers[i] = currentRandomValue;
                    isNotFillCurrentNumber = false;
                }
            }
        }
    }


}
