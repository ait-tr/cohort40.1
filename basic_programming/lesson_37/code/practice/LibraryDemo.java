package lesson_37.code.practice;

public class LibraryDemo {
    public static void main(String[] args) {
        Library<String> stringLibrary = new Library<>();
        stringLibrary.addBook(new Book<>("Три мушкетера", "роман"));
        stringLibrary.addBook(new Book<>("Три поросенка ", "сказка"));

        System.out.println(stringLibrary.getBooksByGenre("сказка"));

    }
}
