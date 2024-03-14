package lesson_42.code.javaInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        outputExample("test_stream.txt");
        inputExample("test_stream.txt");

    }

    public static void outputExample(String path) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path);
        outputStream.write("Привет, как дела?".getBytes());
        outputStream.close();
    }

    public static void inputExample(String path) throws IOException {
        FileInputStream inputStream = new FileInputStream(path);
        int data = inputStream.read();

        while (data != -1) {
            System.out.print( (char) data + " ");
            data = inputStream.read();
        }
        inputStream.close();
    }

}
