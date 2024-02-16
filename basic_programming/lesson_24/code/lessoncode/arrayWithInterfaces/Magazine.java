package lesson_24.code.lessoncode.arrayWithInterfaces;

public class Magazine extends LibraryItem{

    private String issuedNumber;

    public Magazine(String title, int year, String issuedNumber) {
        super(title, year);
        this.issuedNumber = issuedNumber;
    }

    public String getIssuedNumber() {
        return issuedNumber;
    }

    @Override
    void printInfo() {
            System.out.println("Журнал:");
            System.out.println("Название: " + getTitle());
            System.out.println("Номер выпуска: " + getIssuedNumber());
            System.out.println("Год выпуска: " + getYear());

    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issuedNumber='" + issuedNumber + '\'' +
                '}';
    }
}
