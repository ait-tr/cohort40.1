package lesson_10.code.lessoncode.bookVar2;

public class Book {

    private String bookAuthor;
    private String bookName;
    private int bookPages;
    private String catalogNumber;

    public Book(String bookAuthor, String bookName, int bookPages, String catalogNumber) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.catalogNumber = catalogNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookPages=" + bookPages +
                ", catalogNumber='" + catalogNumber + '\'' +
                '}';
    }
}
