package consultation.cons_11.consultationCode.code;

import consultation.cons_11.consultationCode.code.entity.Author;
import consultation.cons_11.consultationCode.code.entity.Book;
import consultation.cons_11.consultationCode.code.entity.Reader;
import consultation.cons_11.consultationCode.code.service.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Reader> readers = new ArrayList<>();

        LibraryManagement management = new LibraryManagement(books, readers);

        Author author1 = new Author(1, "Пушкин");
        Author author2 = new Author(2, "Дюма");
        Author author3 = new Author(3, "Драйзер");
        Author author4 = new Author(4, "Блок");
        Author author5 = new Author(5, "Твен");



        management.addBook(new Book(1,"123-456","Руслан и Людмила", author1));
        management.addBook(new Book(2,"zbzdbzd","Сказка о царе Салтане", author1));
        management.addBook(new Book(3,"123-456","Графиня де Монсоро", author2));
        management.addBook(new Book(4,"123-456","Три мушкетера", author2));
        management.addBook(new Book(5,"123-456","Граф Монте-Кристо", author2));
        management.addBook(new Book(6,"123-456","Американская трагедия", author3));
        management.addBook(new Book(7,"123-456","Финансист", author3));
        management.addBook(new Book(8,"123-456","Стихи", author4));
        management.addBook(new Book(9,"123-456","Приключения Тома Сойера и Гекельберри Финна", author5));

        management.addReader(new Reader(1, "Reader 1"));
        management.addReader(new Reader(2, "Reader 2"));
        management.addReader(new Reader(3, "Reader 3"));


        List<Reader> readerList = management.getReaders();
        Reader reader1 = readerList.get(0);
        List<Book> readerBooks = reader1.getBooksByReader();

        readerBooks.add(management.getBooks().get(4));

        // ------- добавим читателю № 2

        management.getReaders().get(1).getBooksByReader().add(management.getBooks().get(8));

        printList(readers);

    }

    private static void printList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
