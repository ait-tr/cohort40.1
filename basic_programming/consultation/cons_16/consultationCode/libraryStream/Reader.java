package consultation.cons_16.consultationCode.libraryStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader {
    private String fio;  // ФИО
    private String email; // электронный адрес
    private boolean subscriber; // флаг согласия на рассылку
    private List<Book> books; // взятые книги

    public Reader(String fio, String email, boolean subscriber) {
        this.fio = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>();
    }

    public String getFio() {
        return fio;
    }

    public String getEmail() {
        return email;
    }

    public boolean isSubscriber() {
        return subscriber;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", subscriber=" + subscriber +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(fio, reader.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fio);
    }
}
