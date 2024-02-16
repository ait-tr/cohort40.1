package lesson_24.code.lessoncode.arrayWithInterfaces;

import java.util.Arrays;

public class LibraryOperations {

    BookRepository bookRepository = new BookRepository(5);

    MagazineRepository magazineRepository = new MagazineRepository(5);

    public void operations(){
        bookRepository.fill();

        for (int i = 0; i < bookRepository.getItems().length; i++) {
            bookRepository.printInfo();
        }

        magazineRepository.fill();

        for (int i = 0; i < magazineRepository.magazines.length; i++) {
            magazineRepository.magazines[i].printMagazine();
        }

    }
}
