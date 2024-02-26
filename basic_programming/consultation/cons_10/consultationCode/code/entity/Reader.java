package consultation.cons_10.consultationCode.code.entity;

public class Reader {
    private Integer readerId;
    private String name;

    public Reader(Integer readerId, String name) {
        this.readerId = readerId;
        this.name = name;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                '}';
    }
}
