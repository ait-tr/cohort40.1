package consultation.cons_14.consultationCode.generics1;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> integerStringPair = new Pair<>(1, "James");
        Pair<String, String> stringStringPair = new Pair<>("James", "Bond");
        Pair<Double, Integer> doubleIntegerPair = new Pair<>(10.5,17);

    }
}
