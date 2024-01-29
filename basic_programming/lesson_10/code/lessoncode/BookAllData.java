public class BookAllData {
    BookAuthor bookAuthor;
    BookDetails bookDetails;

    public BookAllData(BookAuthor bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookAllData(BookAuthor bookAuthor, BookDetails bookDetails) {
        this.bookAuthor = bookAuthor;
        this.bookDetails = bookDetails;
    }


    @Override
    public String toString() {
        return "BookAllData{" +
                "bookAuthor=" + bookAuthor +
                ", bookDetails=" + bookDetails +
                '}';
    }
}
