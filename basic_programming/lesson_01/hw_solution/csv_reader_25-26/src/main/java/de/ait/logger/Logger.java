package de.ait.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Andrej Reutow
 * created on 10.06.2023
 */
public class Logger {

    public static void info(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:ms"));
        System.out.printf("%s [INFO] %s%n", timestamp, message);
    }

    public static void debug(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:ms"));
        System.out.printf("%s [DEBUG] %s%n", timestamp, message);
    }

    public static void error(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:ms"));
        System.out.printf("%s [ERROR] %s%n", timestamp, message);
    }
}
