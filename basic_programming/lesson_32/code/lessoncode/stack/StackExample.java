package lesson_32.code.lessoncode.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // добавить элементы

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Стек после добавления элементов: " + stack);

        // просмотр верхнего элемента (без его извлечения из коллекции)

        Integer topElement = stack.peek();
        System.out.println("Верхний элемент: " + topElement);
        System.out.println("Стек  элементов: " + stack);

        System.out.println("Второй раз вызываем peek: " + stack.peek());

        int position = stack.search(10);
        if (position != -1) {
            System.out.println("Элемент '10' присутствует и находится на позиции " + position);
        } else {
            System.out.println("Элемент '10' отсутствует");
        }

        // System.out.println(stack.get(0));

        // получение верхнего элемента (извлечения из коллекции)

//        Integer takeTopElement = stack.pop();
//        System.out.println("Верхний элемент: " + takeTopElement);
//        System.out.println("Стек  элементов: " + stack);

        while (!stack.empty()) {
            System.out.println("Верхний элемент: " + stack.pop());
            System.out.println("Стек  элементов: " + stack);
        }


    }
}
