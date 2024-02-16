package lesson_24.code.lessoncode.arrayWithInterfaces;

public class Library {
    public static void main(String[] args) {
//        LibraryOperations lo = new LibraryOperations();
//        lo.operations();

        BookRepository bookRepository = new BookRepository(5);
        LibraryOperationUseInterface louiB = new LibraryOperationUseInterface(bookRepository);

        //louiB.operations();

        MagazineRepository magazineRepository = new MagazineRepository(5);
        LibraryOperationUseInterface louiM = new LibraryOperationUseInterface(magazineRepository);
        louiM.operations();
    }
}
