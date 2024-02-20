package lesson_26.code.lessoncode.arrayListExamples;

public class TV {
    private String manufacturer;
    private int size;

    public TV(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}
