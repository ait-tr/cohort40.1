package lesson_24.code.lessoncode.arrayWithInterfaces;

import lesson_06.code.lessoncode.scanner.UserInput;

public class BookRepository implements LibraryRepository{

    private Book[] books;

    public BookRepository(int booksQuantity) {
        this.books = new Book[booksQuantity];
    }

    @Override
    public void fill(){
        books[0] = new Book("Книга1", 2000, "автор1","детектив");
        books[1] = new Book("Книга2", 2001, "автор2","роман");
        books[2] = new Book("Книга3", 2002, "автор2","роман");
        books[3] = new Book("Книга4", 2003, "автор1","детектив");
        books[4] = new Book("Книга5", 2004, "автор3","классика");

    }

    @Override
    public LibraryItem[] getItems() {
        return books;
    }

    @Override
    public void printInfo() {
        for (int i = 0; i < books.length; i++) {
            books[i].printBook();
        }
    }

    public void fillRepositoryByUser(){

        for (int i = 0; i < books.length; i++) {
           books[i] = createNewBook();
        }
    }


    private Book createNewBook(){
        UserInput ui = new UserInput();
        String title = ui.inputText("Введите название книги: ");

        int year = ui.inputInteger("Введите год издания: ");
        String author = ui.inputText("Введите автора книги: ");
        String genre = ui.inputText("Введите жанр книги: ");

        return new Book(title, year, author, genre);
    }

    private boolean checkInput(){
        return true;
    }
}
