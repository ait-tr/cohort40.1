package lesson_25.code.lessoncode.library;

abstract class LibraryElement {
    protected String title;
    protected String author;
    protected int year;

    public LibraryElement(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
