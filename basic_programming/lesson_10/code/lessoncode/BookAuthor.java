public class BookAuthor {

    String authorName;

    public BookAuthor(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
