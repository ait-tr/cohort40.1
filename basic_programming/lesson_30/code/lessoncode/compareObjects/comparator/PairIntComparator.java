package lesson_30.code.lessoncode.compareObjects.comparator;

import java.util.Comparator;

public class PairIntComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.getOurInteger() - o2.getOurInteger();
    }
}
