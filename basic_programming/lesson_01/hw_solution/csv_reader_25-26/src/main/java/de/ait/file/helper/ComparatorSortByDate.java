package de.ait.file.helper;

import java.io.File;
import java.util.Comparator;

/**
 * @author Andrej Reutow
 * created on 27.05.2023
 * The ComparatorSortByDate class is a custom comparator that compares two files based on their creation dates.
 */
public class ComparatorSortByDate implements Comparator<File> {

    /**
     * Compares two files based on their creation dates.
     *
     * @param o1 the first file to compare
     * @param o2 the second file to compare
     * @return a negative integer if the first file has an earlier creation date,
     * zero if both files have the same creation date,
     * a positive integer if the first file has a later creation date
     */
    @Override
    public int compare(File o1, File o2) {
        long o1CreateDate = FileUtils.readFileAttribute(o1);
        long o2CreateDate = FileUtils.readFileAttribute(o2);
        return Long.compare(o1CreateDate, o2CreateDate);
    }
}
