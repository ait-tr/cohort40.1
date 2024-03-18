package consultation.cons_17.consultationCode.csvFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileReader {
    public static void main(String[] args) {
        String path = "basic_programming/consultation/cons_17/consultationCode/csvFileReader/task.csv";
        String line = "";
        Map<Integer, List<String>> dataMap = new HashMap<>();
        List<String> valuesList = new ArrayList<>();
        int lineNumber = 1;



        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
               String[] values = line.split(",");

               for (String value : values) {
                   valuesList.add(value.trim());
               }
               //dataMap.put(lineNumber++, valuesList);
            }

            System.out.println(valuesList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
