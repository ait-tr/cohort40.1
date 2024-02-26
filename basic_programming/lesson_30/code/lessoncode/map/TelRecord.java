package lesson_30.code.lessoncode.map;

public class TelRecord {
    private String name;
    private String telNumber;

    public TelRecord(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "TelRecord{" +
                "name='" + name + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
