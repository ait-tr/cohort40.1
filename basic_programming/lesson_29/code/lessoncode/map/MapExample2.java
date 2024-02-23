package lesson_29.code.lessoncode.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, String> telBook = new HashMap<>();

        telBook.put("Masha", "12345678");
        telBook.put("Petya", "347634673");
        telBook.put("Oleg", "3562562357");
        telBook.put("Dima", "3474674");
        telBook.put("Nicolay", "2474753457");

        for (Map.Entry<String,String> entry : telBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (String key : telBook.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + telBook.get(key));
        }


        for (String value : telBook.values()) {
            System.out.println("Значение: " + value);
        }

        System.out.println("----- перенос данных из Map в Set<TelRecord> ----");

        Set<TelRecord> records = new HashSet<>();

        for (Map.Entry<String,String> entry : telBook.entrySet()) {
            records.add(new TelRecord(entry.getKey(), entry.getValue()));
        }

        System.out.println(records);

    }
}
