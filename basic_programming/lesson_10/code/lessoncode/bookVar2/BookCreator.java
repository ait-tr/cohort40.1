package lesson_10.code.lessoncode.bookVar2;

import lesson_06.code.lessoncode.scanner.UserInput;

public class BookCreator {

    public Book create(){
        UserInput ui = new UserInput();
        String bookName = ui.inputText("Please enter book name: ");
        String bookAuthor = ui.inputText("Please enter book author: ");
        int bookPages = ui.inputInteger("Please enter book pages: ");
        String bookCatalogNumber = ui.inputText("Please enter book catalog number: ");
        if (bookCatalogNumber.equals("")) {
            bookCatalogNumber = "undefined";
        }

        return new Book(bookName,bookAuthor,bookPages,bookCatalogNumber);

    }

    public Book updateBook(Book bookForUpdate){
        UserInput ui = new UserInput();
        System.out.println("Вы пропустили данные в момент их ввода!");
        String bookCatalogNumber = ui.inputText("Please enter book catalog number: ");
        bookForUpdate.setCatalogNumber(bookCatalogNumber);
        return bookForUpdate;
    }
}
