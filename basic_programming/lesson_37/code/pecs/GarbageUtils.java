package lesson_37.code.pecs;

public class GarbageUtils {


    /*
    Garbage  --------------------
                |               |
    |           |               |
    V           V               V

    Paper     Plastic         Glass
    |
    |
    |
    V
    PaperType2


    Box - объект в котором есть переменная ЛЮБОГО типа от Garbage

     */


    public void printItemWeight(Box<? extends Garbage> box){

        System.out.println("Вес коробки с мусором: " + box.getItemWeight());
    }

    public <T extends Garbage> void addGarbageToBox(Box<? super T> box, T garbage){
        /*
        <T extends Garbage> - параметр типа. Он говорит, что метод будет работать с типом данных "Т"
        который является "Garbage" или его подклассом
        Box<? super T> box - метод принимает объект Box, который может содержать ЛЮБОЙ объект типа "Т"
        или любого из его супер классов

         */

        box.setItem(garbage);
        System.out.println("Мусор добавлен в коробку");
    }


}
