package lesson_10.code.lessoncode.bookVar1;

public class BookDemo {
    public static void main(String[] args) {


        BookAuthor bookAuthor1 = new BookAuthor("Сенкевич");

        BookAuthor bookAuthor2 = new BookAuthor("Пушкин");

        BookDetails bookDetails1 = new BookDetails(300, "Крестоносцы");

        BookDetails bookDetails2 = new BookDetails(50, "Сказка о царе Салтане");


        BookAllData bookAllData1 = new BookAllData(bookAuthor1,bookDetails1);

        BookAllData bookAllData2 = new BookAllData(bookAuthor2,bookDetails2);


        System.out.println(bookAllData1);


        System.out.println(bookAllData2);


        bookAllData1.bookAuthor = bookAuthor2;

        System.out.println(bookAllData1);




        /*
        Когда вы создаете сложные структуры данных, то всегда необходимо учитывать, что
        вы создаете отдельные экземпляры каждого класса, и переменные, которые хранят ссылки
        на эти экземпляры могут менять свои значения (случайно или специально)
         */

    }
}
