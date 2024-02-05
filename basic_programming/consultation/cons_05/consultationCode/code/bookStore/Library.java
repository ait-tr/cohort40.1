package consultation.cons_05.consultationCode.code.bookStore;

import java.util.Arrays;

public class Library {

    private BookStorage[] library;

    public Library(BookStorage[] library) {
        this.library = library;
    }

    public BookStorage[] getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + Arrays.toString(library) +
                '}';
    }

    public void printDataLibrary(){
        for (int i = 0; i < library.length; i++) {

            BookStorage currentBookStorage = library[i]; // берем из массива шкафов текущий шкаф
            BookShelf[] shelvesFromCurrentStorage = currentBookStorage.getBookShelves(); // из этого шкафа получаем ссылку на объект - массив полок ЭТОГО шкафа

            System.out.println(currentBookStorage.getLine());

            for (int j = 0; j < shelvesFromCurrentStorage.length; j++) {
                BookShelf currentBookShelf = shelvesFromCurrentStorage[j]; // берем из этого массива полок - очередную полку
                Book[] booksOnCurrentShelf = currentBookShelf.getBooksOnShelf(); // с этой полки получаем ссылку на массив книг которые на ней находятся

                System.out.println(currentBookShelf.getIdNumber());

                for (int k = 0; k < booksOnCurrentShelf.length; k++) {
                    System.out.println("Книга: " + booksOnCurrentShelf[k]);
                }
            }
        }
    }

    public void searchDataLibrary(String bookNameSearch){

        Book bookSearch = null;

        for (int i = 0; i < library.length; i++) {

            BookStorage currentBookStorage = library[i]; // берем из массива шкафов текущий шкаф
            BookShelf[] shelvesFromCurrentStorage = currentBookStorage.getBookShelves(); // из этого шкафа получаем ссылку на объект - массив полок ЭТОГО шкафа

            for (int j = 0; j < shelvesFromCurrentStorage.length; j++) {
                BookShelf currentBookShelf = shelvesFromCurrentStorage[j]; // берем из этого массива полок - очередную полку
                Book[] booksOnCurrentShelf = currentBookShelf.getBooksOnShelf(); // с этой полки получаем ссылку на массив книг которые на ней находятся


                for (int k = 0; k < booksOnCurrentShelf.length; k++) {
                    if (booksOnCurrentShelf[k].getBookName().contains(bookNameSearch)) {
                        bookSearch = booksOnCurrentShelf[k];
                    }
                }
            }
        }

        if (bookSearch != null) {
            System.out.println("Нашли книгу: " + bookSearch);
        } else {
            System.out.println("Такой книги нет");
        }

    }
}
