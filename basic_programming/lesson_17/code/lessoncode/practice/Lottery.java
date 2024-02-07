package lesson_17.code.lessoncode.practice;

import java.util.Arrays;
import java.util.Random;

public class Lottery {

    private int[] allLotteryNumbers;
    private int[] winnerNumbers;

    public int[] getAllLotteryNumbers() {
        return allLotteryNumbers;
    }

    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    public void createLotteryNumbers(int sizeNumbers) {
        allLotteryNumbers = new int[sizeNumbers];
        for (int i = 0; i < allLotteryNumbers.length; i++) {
            allLotteryNumbers[i] = (i + 1);
        }
    }

    public void shuffleNumbers(){
        Random random = new Random();
        for (int i = allLotteryNumbers.length - 1; i > 0 ; i--) {
            int index = random.nextInt(i + 1);
            // change elements
            int temp = allLotteryNumbers[index];
            allLotteryNumbers[index] = allLotteryNumbers[i];
            allLotteryNumbers[i] = temp;
        }
    }

    public void lotteryRound(int quantityWinnerNumbers){
        winnerNumbers = new int[quantityWinnerNumbers];
        for (int i = 0; i < quantityWinnerNumbers; i++) {
            winnerNumbers[i] = allLotteryNumbers[i];
        }
    }


    public void printWinnerNumbers(){

        System.out.println(Arrays.toString(winnerNumbers));
    }



}
