package code.HW41.Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("title1 ", "Author1");
        Book book2 = new Book("title2 ", "Author2");
        Book book3 = new Book("title3 ", "Author1");
        System.out.println("book1 tags: ");
        book1.addTag();
        System.out.println("book2 tags: ");
        book2.addTag();
        System.out.println("book3 tags: ");
        book3.addTag();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        List<String> uniqTags = books.stream()
                .flatMap(book -> book.getTags().stream())
                .distinct()
                .toList();

        System.out.println(uniqTags);
    }
}
