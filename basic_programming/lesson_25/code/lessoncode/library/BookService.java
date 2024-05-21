package lesson_25.code.lessoncode.library;

class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository repository) {
        this.bookRepository = repository;
    }

    public void addBook(Book book) {
        bookRepository.add(book);
    }

    public void removeBook(Book book) {
        bookRepository.remove(book);
    }

    public Book findBook(String title) {
        return bookRepository.find(title);
    }
}
