package lesson_31.code.lessoncode;

public class Flat implements Comparable<Flat>{
    private int bedroom;
    private double area;

    public Flat(int bedroom, double area) {
        this.bedroom = bedroom;
        this.area = area;
    }

    public int getBedroom() {
        return bedroom;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "bedroom=" + bedroom +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Flat otherFlat) {
        if (this.bedroom != otherFlat.getBedroom()) {
            return Integer.compare(this.bedroom, otherFlat.bedroom);
        } else {
            return Double.compare(this.area, otherFlat.area);
        }
    }


//    @Override
//    public int compareTo(Flat otherFlat) {
//        int compareResult = this.bedroom - otherFlat.bedroom;
//        if (compareResult == 0) {
//           //  compareResult = (int) (this.area - otherFlat.area); - делать нельзя из-за потери данных при приведении типа
//            // т.е. если результат вычитания будет меньше 1 (например 0.9) то
//            // в результате приведения к int мы получим просто 0
//
//            compareResult = (int) Math.ceil(this.area - otherFlat.area);
//        }
//        return compareResult;
//    }
}
