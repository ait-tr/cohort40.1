package lesson_43.code.javaInputOutput;

import java.io.*;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {

        String data = "This is file output stream";


            FileOutputStream fileOutputStream = new FileOutputStream("outputStream.txt");

            byte[] outputArray = data.getBytes();

            fileOutputStream.write(outputArray);
            fileOutputStream.close();


        OutputStream outputStream = new FileOutputStream("text.txt");
        InputStream inputStream = new FileInputStream("text.txt");

        outputStream.write('1');
        outputStream.write('2');
        outputStream.write('3');

        System.out.println("" + (char) inputStream.read());
        System.out.println("" + (char) inputStream.read());
        System.out.println("" + (char) inputStream.read());



    }
}
