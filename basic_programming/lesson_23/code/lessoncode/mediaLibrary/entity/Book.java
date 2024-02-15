package lesson_23.code.lessoncode.mediaLibrary.entity;

public class Book extends MediaItem{

    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }


    @Override
    public void printInfo() {
        System.out.println("Book:" + getTitle() + " " + getAuthor() + " " + getYear() + " " + pageCount);
     }
}
