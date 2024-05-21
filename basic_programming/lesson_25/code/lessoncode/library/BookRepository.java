package lesson_25.code.lessoncode.library;

class BookRepository {
    private Book[] books = new Book[10];
    private int count = 0;

    public void add(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public void remove(Book book) {
        // Удаление книги из массива
    }

    public Book find(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(title)) {
                return books[i];
            }
        }
        return null;
    }
}
