package lesson_32.code.lessoncode.stack;

import java.util.Stack;

public class StackBracketsDemo {
    public static void main(String[] args) {
        String[] stringsForTest = {
                "()",
                "()(())",
                "((()()()(())))",
                ")()()",
                "((())"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + " is correct : " + isCorrectBracket(arrayElement));
        }
    }

    public static boolean isCorrectBracket(String stringLine){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            // если элемент - открывающаяся скобка
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                // если наш стек - пуст, то значит что нет первоначальной открывающейся скобки
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}
