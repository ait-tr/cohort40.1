package consultation.cons_11.consultationCode.code.entity;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private Integer readerId;
    private String name;
    private List<Book> booksByReader;

    public Reader(Integer readerId, String name) {
        this.readerId = readerId;
        this.name = name;
        this.booksByReader = new ArrayList<>();
    }

    public Integer getReaderId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksByReader() {
        return booksByReader;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", booksByReader=" + booksByReader +
                '}';
    }


}
