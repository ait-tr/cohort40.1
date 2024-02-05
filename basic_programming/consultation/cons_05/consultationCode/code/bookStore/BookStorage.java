package consultation.cons_05.consultationCode.code.bookStore;

import java.util.Arrays;

public class BookStorage {

    private String line;
    private int numberOfShelves;
    private BookShelf[] bookShelves;

    public BookStorage(String line, int numberOfShelves) {
        this.line = line;
        this.numberOfShelves = numberOfShelves;
        this.bookShelves = new BookShelf[numberOfShelves];
    }

    public String getLine() {
        return line;
    }

    public BookShelf[] getBookShelves() {
        return bookShelves;
    }

    @Override
    public String toString() {
        return "BookStorage{" +
                "line='" + line + '\'' +
                ", bookShelves=" + Arrays.toString(bookShelves) +
                '}';
    }
}
