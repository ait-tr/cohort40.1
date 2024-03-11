package lesson_39.code.standartFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SupplierExample {
    public static void main(String[] args) {
        Consumer<List<Integer>> modify = list -> list.replaceAll(integer -> integer * integer);

        Consumer<List<Integer>> displayList = list -> list.forEach(listElement -> System.out.print(listElement + ", "));

        List<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(3);
        integers.add(4);

        modify.accept(integers);
        displayList.accept(integers);

        Consumer<List<Integer>> modify2 = list -> list.replaceAll(integer -> integer * 3);
        modify2.accept(integers);

        // ---- АНАЛОГИЧНО ТОЛЬКО БЕЗ ФИ И ЛЯМБД ------

        integers.clear();
        integers.add(2);
        integers.add(3);
        integers.add(4);

        for (int i = 0; i < integers.size(); i++) {
            integers.set(i, integers.get(i) * integers.get(i));
        }


        System.out.println();
        for (Integer listElement : integers) {
            System.out.print(listElement + ", ");
        }

    }
}
