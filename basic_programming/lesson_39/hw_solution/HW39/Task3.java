package code.HW39;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a text to check is a text is palindrome: ");
        String text = scr.nextLine();
        String preparedText = prepareText(text);
        Boolean example1 = isPalindrome.isPalindrome(preparedText);
        System.out.println(example1);
    }
    static isPalindrome isPalindrome = (text)->{
        int leftside = 0;
        int rightside = text.length() -1;
        while (leftside<rightside){
            char leftChar = text.charAt(leftside);
            char rightChar = text.charAt(rightside);
            if (leftChar != rightChar){
                return false;
            }
            leftside++;
            rightside--;
        }
        return true;
    };
    private static String prepareText(String text){
        text = text
                .toLowerCase()
                .replace(" ", "")
                .replace(",", "")
                .replace(".", "")
                .replace("!", "")
                .replace("?", "")
                .replace("'", "")
                .replace("  ", "");
        return text;
    }
    @FunctionalInterface
    public interface isPalindrome{
        Boolean isPalindrome(String text);
    }
}
