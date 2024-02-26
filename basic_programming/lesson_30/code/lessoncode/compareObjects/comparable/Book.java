package lesson_30.code.lessoncode.compareObjects.comparable;

public class Book implements Comparable<Book>{
    private int id;

    private String bookName;

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "entity.Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Book book) {
       int compareResult =  id - book.getId();

       if (compareResult == 0 ) {
           compareResult = bookName.compareTo(book.getBookName());
       }

       return compareResult;
    }
}
