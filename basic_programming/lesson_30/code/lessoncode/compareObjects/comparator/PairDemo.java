package lesson_30.code.lessoncode.compareObjects.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairDemo {
    public static void main(String[] args) {
        Comparator<Pair> pairComparator = new PairStringComparator().thenComparing(new PairIntComparator());

        Set<Pair> ourTeam = new TreeSet<>(pairComparator);


        ourTeam.add(new Pair("John", 1));
        ourTeam.add(new Pair("Zigmund", 11));
        ourTeam.add(new Pair("Boris", 7));
        ourTeam.add(new Pair("John", 46));
        ourTeam.add(new Pair("Alex", 25));
        ourTeam.add(new Pair("Elena",91));
        ourTeam.add(new Pair("Andrew",17));

        System.out.println(ourTeam);

    }
}
