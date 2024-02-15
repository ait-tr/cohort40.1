package lesson_23.code.lessoncode.mediaLibrary;

import lesson_23.code.lessoncode.mediaLibrary.entity.Book;
import lesson_23.code.lessoncode.mediaLibrary.entity.Magazine;
import lesson_23.code.lessoncode.mediaLibrary.service.LibraryCatalog;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addMediaItem(new Book("The Hobbit", "Tolkien", 1935, 400));
        catalog.addMediaItem(new Magazine("National Geographic", "-----", 2023, 14));

        catalog.printAllItems();


    }
}
