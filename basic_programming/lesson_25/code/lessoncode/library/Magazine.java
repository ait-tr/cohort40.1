package lesson_25.code.lessoncode.library;

class Magazine extends LibraryElement {
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }
}
