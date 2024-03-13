package consultation.cons_16.consultationCode.libraryStream;


import java.util.Comparator;
import java.util.List;

public class LibraryUtil {

    public List<Book> doWithoutLambda(List<Book> books) {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getIssueYear().compareTo(o2.getIssueYear());
            }
        });
        return books;
    }

    public List<Book> doWithLambda(List<Book> books) {
        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .toList();

        return sortedBooks;
    }

    public void printBooks(List<Book> books){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public void printReadersBook(List<Reader> readers){
        for (Reader reader : readers) {
            System.out.println("Читатель " + reader.getFio());
            System.out.println("Список его книг: " );
            for (Book book : reader.getBooks()) {
                System.out.println(book);
            }
        }
    }



}
