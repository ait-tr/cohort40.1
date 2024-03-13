package consultation.cons_16.consultationCode.libraryStream;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init(){
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Автор2", "1985", 2021));
        books.add(new Book("Автор3", "1986", 2020));
        books.add(new Book("Автор4", "1987", 2023));
        books.add(new Book("Автор5", "1988", 2022));
        books.add(new Book("Автор6", "1989", 2020));
        books.add(new Book("Автор7", "1900", 2021));
        books.add(new Book("Автор8", "1954", 2022));
        books.add(new Book("Автор9", "1924", 2023));
        // и так далее для других книг

        readers = new ArrayList<>();
        readers.add(new Reader("Reader1","reader1@test.eu", true));
        readers.add(new Reader("Reader2","reader2@gmail.com", false));


        // можем добавить книги в список у читателей

        List<Book> booksFirstReader = readers.get(0).getBooks();

        booksFirstReader.add(books.get(0));
        readers.get(0).getBooks().add(books.get(1));
        readers.get(0).getBooks().add(books.get(2));
        readers.get(0).getBooks().add(books.get(3));
        readers.get(1).getBooks().add(books.get(4));
        readers.get(1).getBooks().add(books.get(5));
        readers.get(1).getBooks().add(books.get(6));

        // и так далее для других читателей и взятых или книг

    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
