package lesson_26.code.lessoncode.arrayListExamples;

import java.util.ArrayList;

public class TvCollection {
    /*
    создать класс TV
    - производитель
    - размер

    создать коллекцию
    и внести туда 3 элемента
    распечатать
    и удалить один - первый из всех у кого совпадет производитель

     */

    public static void main(String[] args) {
        ArrayList<TV> tvs = new ArrayList<>();

        tvs.add(new TV("Sony", 55));
        tvs.add(new TV("Philips", 50));
        tvs.add(new TV("Samsung", 65));

        System.out.println("Наша коллекция:");
        printTvList(tvs);

        String manufacturerForDelete = "Samsung";
        TV tvForRemove = findFirstTvByManufacturer(tvs,manufacturerForDelete);

        if (tvForRemove != null) {
            tvs.remove(tvForRemove);
            System.out.println("Наша коллекция после распродажи:");
            printTvList(tvs);
        } else {
            System.out.println("Такого производителя не найдено!");
        }


    }

    private static void printTvList(ArrayList<TV> tvList){
        for (int i = 0; i < tvList.size(); i++) {
            System.out.println(tvList.get(i));
        }
    }

    private static TV findFirstTvByManufacturer(ArrayList<TV> tvList, String manufacturer){
        for (int i = 0; i < tvList.size(); i++) {
            TV currentTvFromCollection = tvList.get(i);
            if (currentTvFromCollection.getManufacturer().equals(manufacturer)) {
                return currentTvFromCollection;
            }
        }
        return null;
    }
}
