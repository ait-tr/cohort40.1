package bookVar1;

public class BookDetails {

    int pages;
    String description;

    public BookDetails(int pages, String description) {
        this.pages = pages;
        this.description = description;
    }

    @Override
    public String toString() {
        return "bookVar1.BookDetails{" +
                "pages=" + pages +
                ", description='" + description + '\'' +
                '}';
    }
}
