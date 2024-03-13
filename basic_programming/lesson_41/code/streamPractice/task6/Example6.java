package lesson_41.code.streamPractice.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/*
найти всех производителей
 */
public class Example6{
    public static void main(String[] args) {

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("iPhone", 1000));
        phoneList.add(new Phone("Samsung", 950));
        phoneList.add(new Phone("Huawei", 750));
        phoneList.add(new Phone("Motorola", 500));
        phoneList.add(new Phone("Nokia", 620));
        phoneList.add(new Phone("Xiaomi", 900));

        Set<String> phones = phoneList.stream()
                .filter(x -> x.getPrice() > 700)
                .map(x -> x.getModel())
                .collect(Collectors.toSet());

        System.out.println(phones);

    }
}
