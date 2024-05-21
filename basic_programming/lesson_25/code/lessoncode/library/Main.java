package lesson_25.code.lessoncode.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        ReaderRepository readerRepository = new ReaderRepository();
        ReaderService readerService = new ReaderService(readerRepository);
        LendingService lendingService = new LendingService(bookRepository, readerRepository);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Find Book by Title");
            System.out.println("3. Add Reader");
            System.out.println("4. Find Reader by Name");
            System.out.println("5. Lend Book to Reader");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter page count: ");
                    int pageCount = scanner.nextInt();
                    scanner.nextLine();
                    bookService.addBook(new Book(title, author, year, pageCount));
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    title = scanner.nextLine();
                    Book book = bookService.findBook(title);
                    if (book != null) {
                        System.out.println("Book found: " + book.title + ", " + book.author);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter reader name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    readerService.addReader(new Reader(name, id));
                    System.out.println("Reader added.");
                    break;
                case 4:
                    System.out.print("Enter reader name: ");
                    name = scanner.nextLine();
                    Reader reader = readerService.findReader(name);
                    if (reader != null) {
                        System.out.println("Reader found: " + reader.getName());
                    } else {
                        System.out.println("Reader not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter reader name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    lendingService.lendBookToReader(name, title);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
