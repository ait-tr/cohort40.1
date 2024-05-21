package lesson_25.code.lessoncode.library;


import lesson_06.code.lessoncode.scanner.UserInput;

public class Main2 {
    private static UserInput ui = new UserInput();
    private static BookRepository bookRepository = new BookRepository();
    private static BookService bookService = new BookService(bookRepository);
    private static ReaderRepository readerRepository = new ReaderRepository();
    private static ReaderService readerService = new ReaderService(readerRepository);
    private static LendingService lendingService = new LendingService(bookRepository, readerRepository);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Find Book by Title");
            System.out.println("3. Add Reader");
            System.out.println("4. Find Reader by Name");
            System.out.println("5. Lend Book to Reader");
            System.out.println("6. Exit");

            int choice = ui.inputInteger("Enter choice: ");

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    findBookByTitle();
                    break;
                case 3:
                    addReader();
                    break;
                case 4:
                    findReaderByName();
                    break;
                case 5:
                    lendBookToReader();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void addBook() {

        String title = ui.inputText("Enter title: ");

        String author = ui.inputText("Enter author: ");

        int year = ui.inputInteger("Enter year: ");

        int pageCount = ui.inputInteger("Enter page count: ");

        bookService.addBook(new Book(title, author, year, pageCount));
        System.out.println("Book added.");
    }

    private static void findBookByTitle() {

        String title = ui.inputText("Enter title: ");
        Book book = bookService.findBook(title);
        if (book != null) {
            System.out.println("Book found: " + book.title + ", " + book.author);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void addReader() {

        String name = ui.inputText("Enter reader name: ");

        int id = ui.inputInteger("Enter ID: ");
        readerService.addReader(new Reader(name, id));
        System.out.println("Reader added.");
    }

    private static void findReaderByName() {

        String name = ui.inputText("Enter reader name: ");
        Reader reader = readerService.findReader(name);
        if (reader != null) {
            System.out.println("Reader found: " + reader.getName());
        } else {
            System.out.println("Reader not found.");
        }
    }

    private static void lendBookToReader() {

        String readerName = ui.inputText("Enter reader name: ");

        String bookTitle = ui.inputText("Enter book title: ");
        lendingService.lendBookToReader(readerName, bookTitle);
    }
}
