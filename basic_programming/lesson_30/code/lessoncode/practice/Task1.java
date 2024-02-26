package lesson_30.code.lessoncode.practice;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> studentGrades = new HashMap<>();

        // Добавляем оценки для разных студентов и предметов
        addGrade(studentGrades, "Olga", "Math", 8);
        addGrade(studentGrades, "Olga", "History", 10);
        addGrade(studentGrades, "Ruslan", "Math", 12);
        addGrade(studentGrades, "Ruslan", "History", 9);

        // Получаем оценки для конкретного студента и предмета
        System.out.println("Оценка Olga по Математике: " + getGrade(studentGrades, "Olga", "Math"));
        System.out.println("Оценка Ruslan по Истории: " + getGrade(studentGrades, "Ruslan", "History"));
    }

    // Метод для добавления оценки
    public static void addGrade(Map<String, Map<String, Integer>> studentGrades, String studentName, String subject, int grade) {
        if (studentGrades.get(studentName) == null) {
            studentGrades.put(studentName, new HashMap<>());
        }
        //studentGrades.putIfAbsent(studentName, new HashMap<>());
        studentGrades.get(studentName).put(subject, grade);
    }

    // Метод для получения оценки
    public static int getGrade(Map<String, Map<String, Integer>> studentGrades, String studentName, String subject) {
        if (studentGrades.containsKey(studentName) && studentGrades.get(studentName).containsKey(subject)) {
            return studentGrades.get(studentName).get(subject);
        } else {
            return -1; // Возвращаем -1, если оценка не найдена
        }
    }
}
