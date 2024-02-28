package lesson_32.code.lessoncode.practice;

import java.util.Stack;

public class Task1 {


    public static void main(String[] args) {
        String[] stringsForTest = {
                "()",
                "[]({})",
                "([()[](){()}])",
                ")[]()",
                "({([])})"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + " is correct : " + isCorrectBracket(arrayElement));
        }
    }
        public static boolean isCorrectBracket(String stringLine) {
            Stack<Character> stack = new Stack<>();
            for (char ch : stringLine.toCharArray()) {
                // Помещаем в стек открывающие скобки
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    // Если стек пуст при встрече закрывающей скобки, последовательность неверна
                    if (stack.isEmpty()) {
                        return false;
                    }
                    // Проверяем, соответствует ли верхний элемент стека текущей закрывающей скобке
                    char top = stack.pop(); // Получаем и удаляем верхний элемент стека

                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false; // Если не соответствует, последовательность неверна
                    }
                }
            }
            // Если стек пуст после обработки всех символов, последовательность верна
            return stack.empty();
        }

// перепишите логику кода таким образом, чтобы в стек помещались не
    // открывающиеся скобки, а "ожидаемые" закрывающиеся


}
