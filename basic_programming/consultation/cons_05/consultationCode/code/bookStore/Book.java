package consultation.cons_05.consultationCode.code.bookStore;

public class Book {

    private String catalogNumber;
    private String bookName;
    private Author author;


    public Book(String catalogNumber, String bookName, Author author) {
        this.catalogNumber = catalogNumber;
        this.bookName = bookName;
        this.author = author;
    }


    public String getCatalogNumber() {
        return catalogNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "catalogNumber='" + catalogNumber + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
