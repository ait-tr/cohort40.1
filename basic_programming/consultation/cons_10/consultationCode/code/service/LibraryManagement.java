package consultation.cons_10.consultationCode.code.service;

import consultation.cons_10.consultationCode.code.entity.Book;
import consultation.cons_10.consultationCode.code.entity.BookAndReader;
import consultation.cons_10.consultationCode.code.entity.Reader;

import java.util.ArrayList;
import java.util.List;

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

    public void addBookAndReader(BookAndReader bookAndReader){
        bookAndReaders.add(bookAndReader);
    }



    // получить список книг, которые выданы читателю
    public List<Book> getBookByReader(Integer readerId){
        List<Book> allBooksByReader = new ArrayList<>();

        // мы должны пройтись по коллекции объектов читатель-книга
        // найти в них номер читателя
        // сравнить это номер с предметом для поиска
        // если номер совпадает, то мы должны
        // взять номер книги который соответствует это записи
        // и НАЙТИ среди всех экземпляров класса 'книга'
        // ту, у которой это ID совпадает

        for (int i = 0; i < bookAndReaders.size(); i++) {
            Integer currentReaderId = bookAndReaders.get(i).getReaderId();
            if (currentReaderId.equals(readerId)) {

                Book foundedBookById = findBookById(bookAndReaders.get(i).getBookId());

                if (foundedBookById != null) {
                allBooksByReader.add(foundedBookById);
                } else {
                    System.out.println("Книга потеряна!");
                }
            }
        }

        return allBooksByReader;

    }

    private Book findBookById(Integer bookId) {
        for (Book book : books){
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

}
