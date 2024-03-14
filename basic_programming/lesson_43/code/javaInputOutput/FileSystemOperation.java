package lesson_43.code.javaInputOutput;

import java.io.File;
import java.util.Arrays;

public class FileSystemOperation {
    public static void main(String[] args) {

        File file = new File("test.txt");

        boolean isExist = file.exists();

        System.out.println("Does file exist? " + isExist);

        // ---------

        File dir = new File("new_dir");
        boolean wasCreate = dir.mkdir();

        System.out.println("Directory was create? " + wasCreate);

        // -------

        File directory = new File("new_dir");
        boolean isDir = directory.isDirectory();
        System.out.println(isDir);

        // ------
//        boolean successDelete = directory.delete();
//        System.out.println(successDelete);

        String[] filenames = directory.list();

        System.out.println(Arrays.toString(filenames));

        File[] files = directory.listFiles();

        System.out.println(Arrays.toString(files));

    }
}
