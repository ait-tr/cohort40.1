package lesson_10.code.lessoncode.bookVar2;

public class BookApp {
    public static void main(String[] args) {

// создаем экземпляры всех рабочих классов которые будем использовать

        BookCreator creator = new BookCreator();
        CheckOurBook checkOurBook = new CheckOurBook();

// создаем книгу


        Book book1 = creator.create();

        System.out.println(book1);

// теперь нам надо в случае ЕСЛИ у нас каталог номер не определен - его заменить

        if (checkOurBook.checkCatalogNumberForUndefined(book1)) {
          book1 = creator.updateBook(book1);
            System.out.println("книга после обновления данных");
            System.out.println(book1);
        }






    }
}
