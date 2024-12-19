package consultation.cons_05.consultationCode.code.bookStore;

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

    @java.lang.Override
    public java.lang.String toString() {
        return "BookStorage{" +
                "line=" + line +
                ", numberOfShelves=" + numberOfShelves +
                ", bookShelves=" + java.util.Arrays.toString(bookShelves) +
                '}';
    }
}
