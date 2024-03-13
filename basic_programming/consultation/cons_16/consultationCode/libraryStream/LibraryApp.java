package consultation.cons_16.consultationCode.libraryStream;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUtil util = new LibraryUtil();

       util.printBooks(library.getBooks());

       util.printReadersBook(library.getReaders());
    }
}
