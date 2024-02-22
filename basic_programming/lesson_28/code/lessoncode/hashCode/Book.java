package lesson_28.code.lessoncode.hashCode;

import java.util.Objects;

public class Book {
    String bookName;
    String bookAuthor;
    String publisher;

    public Book(String bookName, String bookAuthor, String publisher) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor);
    }
}
