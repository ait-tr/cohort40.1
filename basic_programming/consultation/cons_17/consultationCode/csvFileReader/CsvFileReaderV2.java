package consultation.cons_17.consultationCode.csvFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileReaderV2 {
    public static void main(String[] args) {
        String path = "basic_programming/consultation/cons_17/consultationCode/csvFileReader/task.csv";
        String line = "";
        Map<String, List<String>> dataMap = new HashMap<>();
        List<String> headers = new ArrayList<>();


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            int lineNumber = 0;
            int headerCounter = 0;

            while ((line = bufferedReader.readLine()) != null) {

                String[] values = line.split(",");

                if (lineNumber == 0) { // считать строку с заголовками
                    String[] headersArray = line.split(",");
                    for (String headerElement : headersArray) {
                        headers.add(headerElement.trim());
                    }
                    lineNumber++;
                } else {
                    List<String> valuesList = new ArrayList<>();

                    for (String value : values) {
                        valuesList.add(value.trim());
                    }

                    dataMap.put(headers.get(headerCounter++), valuesList);

                }
            }

            System.out.println(headers);
            System.out.println(dataMap);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
