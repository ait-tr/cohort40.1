package consultation.cons_11.consultationCode.code.service;

import consultation.cons_11.consultationCode.code.entity.Book;
import consultation.cons_11.consultationCode.code.entity.BookAndReader;
import consultation.cons_11.consultationCode.code.entity.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryManagement {

    private List<Book> books;
    private List<Reader> readers;
    private List<BookAndReader> bookAndReaders;

    public LibraryManagement(List<Book> books, List<Reader> readers, List<BookAndReader> bookAndReaders) {
        this.books = books;
        this.readers = readers;
        this.bookAndReaders = bookAndReaders;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public List<BookAndReader> getBookAndReaders() {
        return bookAndReaders;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addReader(Reader reader){
        readers.add(reader);
    }

    public void bookAndReader(BookAndReader bookAndReader){
        bookAndReaders.add(bookAndReader);
    }

    // получить список книг, которые выданы читателю
    public List<Book> getBookByReader(Integer readerId){
        List<Book> allBooksByReader = new ArrayList<>();
        for (int i = 0; i < bookAndReaders.size(); i++) {
            Integer currentReaderId = bookAndReaders.get(i).getReaderId();
            if (currentReaderId.equals(readerId)) {
                //
                allBooksByReader.add()
            }
        }

    }

}
