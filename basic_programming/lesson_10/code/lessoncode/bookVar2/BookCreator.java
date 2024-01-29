package bookVar2;

import scanner.UserInput;

public class BookCreator {

    public Book create(){
        UserInput ui = new UserInput();
        String bookName = ui.inputText("Please enter book name: ");
        String bookAuthor = ui.inputText("Please enter book author: ");
        int bookPages = ui.inputInteger("Please enter book pages: ");
        String bookCatalogNumber = ui.inputText("Please enter book catalog number: ");
        if (bookCatalogNumber.equals("")) {
            bookCatalogNumber = "undefine";
        }

        return new Book(bookName,bookAuthor,bookPages,bookCatalogNumber);


    }
}
