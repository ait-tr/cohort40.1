package bookVar2;

public class BookApp {
    public static void main(String[] args) {


        BookCreator creator = new BookCreator();

        Book book1 = creator.create();

        System.out.println(book1);

    }
}
