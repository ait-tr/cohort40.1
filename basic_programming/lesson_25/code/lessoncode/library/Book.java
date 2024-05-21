package lesson_25.code.lessoncode.library;

class Book extends LibraryElement {
    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}
