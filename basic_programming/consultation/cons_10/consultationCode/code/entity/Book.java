package consultation.cons_10.consultationCode.code.entity;

public class Book {
    private Integer bookId;
    private String isbn;
    private String title;
    private Author author;

    public Book(Integer bookId, String isbn, String title, Author author) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
