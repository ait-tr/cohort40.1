package consultation.cons_05.consultationCode.code.bookStore;

import java.util.Arrays;

public class BookShelf {

    private String idNumber;
    private Book[] booksOnShelf;

    public BookShelf(String idNumber, Book[] booksOnShelf) {
        this.idNumber = idNumber;
        this.booksOnShelf = booksOnShelf;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Book[] getBooksOnShelf() {
        return booksOnShelf;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "idNumber='" + idNumber + '\'' +
                ", booksOnShelf=" + Arrays.toString(booksOnShelf) +
                '}';
    }
}
