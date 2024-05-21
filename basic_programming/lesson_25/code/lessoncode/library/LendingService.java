package lesson_25.code.lessoncode.library;

public class LendingService {
    private BookRepository bookRepository;
    private ReaderRepository readerRepository;

    public LendingService(BookRepository bookRepository, ReaderRepository readerRepository) {
        this.bookRepository = bookRepository;
        this.readerRepository = readerRepository;
    }

    public void lendBookToReader(String readerName, String bookTitle) {
        Reader reader = readerRepository.find(readerName);
        Book book = bookRepository.find(bookTitle);
        if (reader != null && book != null) {
            // Логика выдачи книги читателю
            System.out.println("Book '" + book.title + "' lent to " + reader.getName());
        } else {
            System.out.println("Error: Book or reader not found.");
        }
    }
}
