package lesson_10.code.lessoncode.bookVar1;

public class BookAuthor {

    String authorName;

    public BookAuthor(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "bookVar1.BookAuthor{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
