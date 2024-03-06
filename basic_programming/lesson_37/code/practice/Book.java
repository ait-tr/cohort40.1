package lesson_37.code.practice;

class Book<T> {
    private String title;
    private T genre;

    public Book(String title, T genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public T getGenre() {
        return genre;
    }
}
