package lesson_24.code.lessoncode.arrayWithInterfaces;

public class Book extends LibraryItem{
    private String author;
    private String genre;

    public Book(String title, int year, String author, String genre) {
        super(title, year);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    void printBook() {
        System.out.println("Книга:");
        System.out.println("Название: " + getTitle());
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Год выпуска: " + getYear());

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
