package lesson_32.code.lessoncode.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    private static Queue<String> history = new LinkedList<>();

    // Метод для добавления новой страницы в историю
    public static void visitPage(String page) {
        history.offer(page);
    }

    // Метод для вывода всей истории посещений
    public static void printHistory() {
        System.out.println("История посещений:");
        for (String page : history) {
            System.out.println(page);
        }
    }

    public static void main(String[] args) {

        // Симуляция посещения страниц
        visitPage("Главная страница");
        visitPage("Новости");
        visitPage("Контакты");
        visitPage("О нас");

        // Вывод истории посещений
        printHistory();
    }
}
