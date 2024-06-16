package code.HW41.Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private List<String> tags;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.tags = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                '}';
    }

    boolean wantToContinue = true;

    public List<String> addTag() {
        while (wantToContinue) {
            System.out.println("Enter tag: ");
            Scanner scanner = new Scanner(System.in);
            String tag = scanner.nextLine();
            tags.add(tag);

            System.out.println("Want to add another tag? Y/N");
            String toContinue = scanner.nextLine();

            if (toContinue.equalsIgnoreCase("n")) {
                wantToContinue = false;
            }
        }

        return tags;
    }
}
