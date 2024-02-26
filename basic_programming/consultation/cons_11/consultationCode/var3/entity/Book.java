package consultation.cons_11.consultationCode.var3.entity;

public class Book {
    private Integer bookId;
    private String isbn;
    private String title;
    private Author author;
    private Integer readerId;

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

    public Integer getReaderId() {
        return readerId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", readerId=" + readerId +
                '}';
    }
}
