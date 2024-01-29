package lesson_06.code.lessoncode.random;

public class RandomWithMathMethod {
    public static void main(String[] args) {

        double random1 = Math.random();

        //System.out.println(random1);
        /*
        диапазон значений от 0 до 1 (не включая) [0;1)

        Вопрос: а как нам получить псевдослучайное число в диапазоне от
        числа min до числа max

        min = 100
        max = 500

        как получить значение от 100 до 500 если random() возвращает значение от 0 до 1?

        min + random() * ( max - min + 1)

         */

        double random2 = Math.random() * ( 50 - 10 + 1) + 10;

        long random2Int = Math.round(random2);

        System.out.println(random2Int);


        double random3 = Math.random() * (100 - 0 + 1) + 0;
        double random4 = Math.random() * (150 - 120 + 1) + 120;
        double random5 = Math.random() * (1_000_000 - 150_000 + 1) + 150_000;

        System.out.println("1st random example: " + Math.round(random1));
        System.out.println("2nd random example: " + Math.round(random2));
        System.out.println("3rd random example: " + Math.round(random3));
        System.out.println("4th random example: " + Math.round(random4));
        System.out.println("5th random example: " + Math.round(random5));

        /*
        Math.round() - стандартное округление

        Math.floor() - округление вниз до ближайшего целого - по сути отбрасывает после запятой 2,9 -> 2

        Math.cell()- округление вверх до ближайшего целого - 2,1 -> 3
         */

        double myDouble = 3.1415497;

        System.out.println(Math.round(myDouble * 10000) / 10000.0);

    }
}
