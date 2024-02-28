package lesson_32.code.lessoncode.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task3 {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println("'" + s1 + "' is palindrome: " + isPalindrome(s1));
        System.out.println("'" + s2 + "' is palindrome: " + isPalindrome(s2));
    }

        public static boolean isPalindrome(String checkedText) {

            String modifiedText = checkedText.toLowerCase();
            modifiedText = modifiedText.replace(",", "");
            modifiedText = modifiedText.replace(":", "");
            modifiedText = modifiedText.replace(")", "");
            modifiedText = modifiedText.replace("(", "");
            modifiedText = modifiedText.replace("'", "");
            modifiedText = modifiedText.replace(" ", "");

            Deque<Character> deque = new ArrayDeque<>();

            for (char c : modifiedText.toCharArray()) {
                deque.offerLast(c);
            }

            while (deque.size() > 1) {
                if (!deque.pollFirst().equals(deque.pollLast())) {
                    return false;
                }
            }

            return true;
        }

}
