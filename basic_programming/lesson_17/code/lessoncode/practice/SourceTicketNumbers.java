package lesson_17.code.lessoncode.practice;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.Random;

public class SourceTicketNumbers {

    public int receiveTicketNumber(boolean isRandom, int sizeLotteryNumbers, int ticketNumber, int currentIndex){
        // данный метод будет возвращать очередной номер для заполнения нашего билета

        int currentRandomValue = 0;

        if (isRandom) {
            currentRandomValue = receiveFromRandom(sizeLotteryNumbers);
        } else {
            currentRandomValue = receiveFromUserInput(ticketNumber, currentIndex);
        }

        return currentRandomValue;
    }


    private int receiveFromRandom(int sizeLotteryNumbers){
        // данный метод будет возвращать очередной номер для заполнения рандомно){

        Random random = new Random();

        return random.nextInt(sizeLotteryNumbers + 1);
    }

    private int receiveFromUserInput( int ticketNumber, int currentIndex){
        // данный метод будет возвращать очередной номер для заполнения через UserInput){
        UserInput userInput = new UserInput();

        return userInput.inputInteger("Введите для билета № " + (ticketNumber + 1)  + " значение для числа № " + (currentIndex + 1) + " : ");
    }

}
