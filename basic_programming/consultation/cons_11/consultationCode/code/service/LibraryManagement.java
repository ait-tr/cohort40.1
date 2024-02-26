package consultation.cons_11.consultationCode.code.service;

import consultation.cons_11.consultationCode.code.entity.Book;
import consultation.cons_11.consultationCode.code.entity.Reader;
import java.util.List;

public class LibraryManagement {

    private List<Book> books;
    private List<Reader> readers;

    public LibraryManagement(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void addReader(Reader newReader){
        readers.add(newReader);
    }

}
