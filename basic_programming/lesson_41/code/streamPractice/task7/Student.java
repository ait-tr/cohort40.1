package lesson_41.code.streamPractice.task7;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> book;

    public Student( String name) {
        this.name = name;
        this.book = new HashSet<>();
    }

    public void addBook(String book){
            this.book.add(book);
    }


    public String getName() {
        return name;
    }


    public Set<String> getBook() {
        return book;
    }


    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
