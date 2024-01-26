package switchExample;

import scanner.UserInput;

public class SwitchExample2 {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int word = ui.inputInteger("Please enter any english word: ");

        switch (word) {
            case 1:
            case 2:
            case 3:
                System.out.println("Число в диапазоне от 1 до 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Число в диапазоне от 4 до 6");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Число в диапазоне от 7 до 9");
                break;

            default:
                System.out.println("Этого я еще не знаю (((");

        }


    }
}
