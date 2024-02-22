package lesson_28.code.lessoncode.hashCode;

import java.util.Objects;

public class Magazine {

    String name;
    String numberIssue;

    public Magazine(String name, String numberIssue) {
        this.name = name;
        this.numberIssue = numberIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name) && Objects.equals(numberIssue, magazine.numberIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberIssue);
    }
}
