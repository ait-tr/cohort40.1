package lesson_24.code.lessoncode.arrayWithInterfaces;

import java.util.Arrays;

public class LibraryOperations {

    BookRepository bookRepository = new BookRepository(5);

    public void operations(){
        bookRepository.fillRepositoryByUser();

        for (int i = 0; i < bookRepository.books.length; i++) {
            bookRepository.books[i].printInfo();
        }
    }
}
