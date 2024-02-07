package lesson_17.code.lessoncode.practice;

public class LotteryTicket {
    private int[] ticketNumbers;

    public int[] getTicketNumbers() {
        return ticketNumbers;
    }

    public void createAndFillTicket(int sizeTicket, int sizeLotteryNumbers, boolean isRandom, int idTicket){
        ticketNumbers = new int[sizeTicket];
        fillTicket(sizeLotteryNumbers, isRandom,idTicket);
    }


    private void fillTicket(int sizeLotteryNumbers, boolean isRandom, int idTicket){

        SourceTicketNumbers source = new SourceTicketNumbers();

        for (int i = 0; i < ticketNumbers.length; i++) {

            boolean isNotFillCurrentNumber = true;
            int currentRandomValue = 0;

            while (isNotFillCurrentNumber) {

                source.receiveTicketNumber(isRandom, sizeLotteryNumbers, i, idTicket);

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
