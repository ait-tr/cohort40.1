package lesson_41.code.streamPractice.task7;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task7Example{
    /*
Студент записывает книги которые прочитал,
задача вывести все прочитанные книги у всех студентов
(в качестве дополнения, применить фильтр на тему: найти книги которые не содержат HTML)
 */

    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.addBook("Java 8 vs Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        Set<String> strings = list.stream()
                .map(student -> student.getBook())
                .flatMap(x -> x.stream())
                .collect(Collectors.toSet());

        Set<String> noHtmlBooks = strings.stream()
                .filter(book -> !book.contains("HTML"))
                .collect(Collectors.toSet());


        System.out.println(strings);
        System.out.println(noHtmlBooks);

    }
}
