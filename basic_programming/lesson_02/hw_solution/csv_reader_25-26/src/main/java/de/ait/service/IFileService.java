package de.ait.service;

import java.io.File;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 27.05.2023
 * The IFileService interface defines methods for reading and writing files.
 */
public interface IFileService {

    /**
     * Reads a folder and returns the file with the oldest creation date among files with the allowed extension (.csv).
     *
     * @param folderPath the path to the folder to read
     * @return the file with the oldest creation date among files with the allowed extension
     * @throws RuntimeException if the provided path is not a directory
     */
    File readFolder(String folderPath);

    /**
     * Reads the content of a file and returns it as a list of strings, where each string represents a line in the file.
     *
     * @param fileToRead the file to read
     * @return a list of strings representing the content of the file
     * @throws RuntimeException if an I/O error occurs while reading the file
     */
    List<String> readFile(File fileToRead);

    /**
     * Writes the specified rows of data to a file at the given path.
     *
     * @param rows        the list of strings representing the data to write
     * @param pathToWrite the path to the file to write
     * @throws RuntimeException if an I/O error occurs while writing to the file
     */
    void writeFile(List<String> rows, String pathToWrite);
}
