package lesson_28.code.lessoncode.hashCode;

public class BookCompare {
    public static void main(String[] args) {
        Book book1 = new Book("Три мушкетера", "Дюма", "Детская литература");
        Book book2 = new Book("Три товарища", "Ремарк", "Юность");

        System.out.println(book1.equals(book2));

        Book book3 = new Book("Три товарища", "Ремарк", "Наука");

        System.out.println(book2.equals(book3));

    }

}
