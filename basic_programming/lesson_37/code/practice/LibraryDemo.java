package lesson_37.code.practice;

public class LibraryDemo {
    public static void main(String[] args) {
        Library<String> stringLibrary = new Library<>();
        stringLibrary.addBook(new Book<>("Три мушкетера", "роман"));
        stringLibrary.addBook(new Book<>("Три поросенка ", "сказка"));

        System.out.println(stringLibrary.getBooksByGenre("сказка"));
//================================================

        Genre1 genre1 = new Genre1("роман");
        Genre2 genre2 = new Genre2("сказка");

        Library<Genre> genreLibrary = new Library<>();
        genreLibrary.addBook(new Book<>("Три мушкетера", genre1));
        genreLibrary.addBook(new Book<>("Три поросенка ", genre2));

        System.out.println(genreLibrary.getBooksByGenre(genre1));

    }
}
