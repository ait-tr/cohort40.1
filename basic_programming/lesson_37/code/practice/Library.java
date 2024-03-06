package lesson_37.code.practice;

import java.util.*;

class Library<T> {
    private Map<T, List<Book<T>>> booksByGenre = new HashMap<>();

    public void addBook(Book<T> book) {
        List<Book<T>> books = booksByGenre.getOrDefault(book.getGenre(), new ArrayList<>());
//        if (books == null) {
//            books = new ArrayList<>();
//        }
        books.add(book);
        booksByGenre.put(book.getGenre(), books);
    }

    public List<Book<T>> getBooksByGenre(T genre) {
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }

    public Optional<Book<T>> findBookByTitle(String title) {
        for (List<Book<T>> books : booksByGenre.values()) {
            for (Book<T> book : books) {
                if (book.getTitle().equals(title)) {
                    return Optional.of(book);
                }
            }
        }
        return Optional.empty();
    }
}
