package lesson_30.code.lessoncode.practice;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
          public static void main(String[] args) {

            Set<String> uniqueVisitors = new HashSet<>();

            // Предположим, что каждый раз, когда пользователь посещает сайт, его идентификатор добавляется в Set
            addVisitor(uniqueVisitors, "user1");
            addVisitor(uniqueVisitors, "user2");
            addVisitor(uniqueVisitors, "user3");
              // пользователь user1 посетил сайт повторно
            addVisitor(uniqueVisitors, "user1");

            // Выводим количество уникальных посетителей
            System.out.println("Количество уникальных посетителей за период: " + uniqueVisitors.size());
        }

        // Метод для добавления уникального посетителя
        public static void addVisitor(Set<String> uniqueVisitors, String userId) {
            uniqueVisitors.add(userId);
        }

}
