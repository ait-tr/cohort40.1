package lesson_43.code.javaIO.bufferReaderWriter;

import java.io.*;

public class WriteAndReadTextBuffer {
    public static void main(String[] args) throws IOException {

        WriteAndReadTextBuffer wrtb = new WriteAndReadTextBuffer();

        String path = "basic_programming/lesson_43/resource/writeExample.txt";

        wrtb.writeBufferFile(path);

        wrtb.readerBufferFile(path);


    }

    public void writeBufferFile(String path) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write("Hello, World! \n");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("как дела?");
        bufferedWriter.newLine();
        bufferedWriter.write("все отлично \n");
        bufferedWriter.close();

    }

    public void readerBufferFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("basic_programming/lesson_43/resource/writeExample2.txt"));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        bufferedReader.close();
    }

}
