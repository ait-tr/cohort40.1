package consultation.cons_05.consultationCode.code.bookStore;

public class LibraryApp {
    public static void main(String[] args) {

        Author author1 = new Author("Джек Лондон");
        Author author2 = new Author("Голсуорси");
        Author author3 = new Author("Жуль Верн");
        Author author4 = new Author("Пушкин");


        Book book1 = new Book("A-001-001", "Белый клык", author1);
        Book book2 = new Book("A-002-002", "Зов предков", author1);
        Book book3 = new Book("A-003-003", "Сага о Форсайтах", author2);
        Book book4 = new Book("A-001-004", "Таинственный остров", author3);
        Book book5 = new Book("A-005-005", "80 тысяч лье под водой", author3);
        Book book6 = new Book("A-006-006", "Во круг света за 80 дней", author3);
        Book book7 = new Book("A-007-007", "Руслан и Людмила", author4);
        Book book8 = new Book("A-008-008", "Сказка о царе Салтане", author4);


       // Book[] booksForShelf1 = {book1,book3}; - расвернутый вариант

        BookShelf bookShelf1 = new BookShelf("B1", new Book[]{book1,book3});
        BookShelf bookShelf2 = new BookShelf("C1", new Book[]{book2,book6});
        BookShelf bookShelf3 = new BookShelf("A1", new Book[]{book4,book5});
        BookShelf bookShelf4 = new BookShelf("D1", new Book[]{book8,book7});


        BookStorage bookStorage1 = new BookStorage("Left side", 2);
        BookStorage bookStorage2 = new BookStorage("Right side", 2);

        bookStorage1.getBookShelves()[0] = bookShelf1;
        bookStorage1.getBookShelves()[1] = bookShelf2;
        bookStorage2.getBookShelves()[0] = bookShelf3;
        bookStorage2.getBookShelves()[1] = bookShelf4;

        Library library = new Library(new BookStorage[] {bookStorage1,bookStorage2});

       // System.out.println(library);

        library.printDataLibrary();

        System.out.println("------------");
        library.searchDataLibrary("Черный");


    }
}
