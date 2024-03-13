package consultation.cons_16.consultationCode.libraryStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUtil util = new LibraryUtil();

       util.printBooks(library.getBooks());

       util.printReadersBook(library.getReaders());


        List<Reader> readers = library.getReaders();

        String searchAuthorCriteria = "Автор2";

        List<Book> booksByAuthor = readers.stream()
                .flatMap(reader -> reader.getBooks().stream())
                .filter(book -> book.getAuthor().equals(searchAuthorCriteria))
                .toList();

        System.out.println(booksByAuthor);


        System.out.println("---------- список книг по авторам ------");
        Map<String, List<Book>> booksByAuthors = readers.stream()
                .flatMap(reader -> reader.getBooks().stream())
                .collect(Collectors.groupingBy(Book::getAuthor));


        for (Map.Entry<String, List<Book>> entry : booksByAuthors.entrySet()) {
            System.out.println("Author: " + entry.getKey());
            System.out.print("Books: ");
            for (Book book : entry.getValue()) {
                System.out.print(book.getName() + "; ");
            }
            System.out.println("\n");
        }
    }
}
