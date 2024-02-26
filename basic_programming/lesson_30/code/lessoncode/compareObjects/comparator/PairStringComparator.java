package lesson_30.code.lessoncode.compareObjects.comparator;

import java.util.Comparator;

public class PairStringComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.getOurString().compareTo(o2.getOurString());
    }
}
