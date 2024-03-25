package de.ait.service;

import de.ait.file.helper.ComparatorSortByDate;
import de.ait.logger.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 27.05.2023
 * The FileService class implements the IFileService interface and provides methods for
 * reading files from a folder, reading the content of a file, and writing data to a file.
 */
public class FileService implements IFileService {

    private static final String ALLOWED_EXTENSION = ".csv";

    /**
     * {@inheritDoc}
     */
    @Override
    public File readFolder(String folderPath) {

        //todo remove it
        /*
            Описание:
                Создается объект File с указанным folderPath.
                Проверяется, является ли указанный путь директорией с помощью метода isDirectory(). Если путь не является директорией, выбрасывается исключение RuntimeException с сообщением "This path is not a directory".
                Создается пустой список files, в котором будут храниться файлы с разрешенным расширением.
                Происходит итерация по файлам, полученным из вызова directory.listFiles().
                Для каждого файла проверяется, оканчивается ли его имя на разрешенное расширение .csv. Если да, файл добавляется в список files.
                Список files сортируется с использованием компаратора ComparatorSortByDate, который сравнивает файлы на основе их даты создания.
                Возвращается первый файл из отсортированного списка files с наиболее старой датой создания.
         */

        File directory = new File(folderPath);
        Logger.info("Читаю папку: " + folderPath);
        if (!directory.isDirectory()) {
            throw new RuntimeException("This path is not a directory");
        }

        List<File> files = new ArrayList<>();
        //todo handle file with now allowed extension
        for (File file : directory.listFiles()) {
            if (file.getName().endsWith(ALLOWED_EXTENSION)) {
                files.add(file);
            }
        }
        Logger.info("В папке " + folderPath + " содержится " + files.size() + " файлов");
        files.sort(new ComparatorSortByDate());
        File file = files.get(0);
        Logger.info("Самый старый файл в папке: " + folderPath + " : " + file.getName());
        return file;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> readFile(File fileToRead) {
        Logger.info("Читаем файл:" + fileToRead.getName());
        try {
            List<String> rows = Files.readAllLines(fileToRead.getAbsoluteFile().toPath());
            Logger.debug("Файл " + fileToRead.getName() + ", количество строк:" + rows.size());
            return rows;
        } catch (IOException e) {
            //TODO handle it
            throw new RuntimeException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void writeFile(List<String> rows, String pathToWrite) {
        try (FileWriter fileWriter = new FileWriter(pathToWrite, true)) {
            for (String row : rows) {
                fileWriter.write(row + System.lineSeparator());
            }
        } catch (IOException e) {
            //todo handle it
            throw new RuntimeException(e);
        }
    }
}
