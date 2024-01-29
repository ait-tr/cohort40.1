package lesson_09.code.lessoncode.ifStatement;

public class ConditionalOperators {

    public static void main(String[] args) {


        boolean isTrue = true;

        boolean isFalse = false;


        /**

         Conditional And (&&)- "логическое умножение"

         результат = логическая переменная № 1 && логическая переменная № 2

         результат будет иметь значение true ТОГДА И ТОЛЬКО ТОГДА когда обе переменные будут иметь значение true

         */

        boolean resultConditionalAND = isTrue && isFalse;

        System.out.println(resultConditionalAND);


        /**

         Conditional OR (||) - "логическое сложение"

         результат = логическая переменная № 1 || логическая переменная № 2

         результат будет иметь значение true когда хотя бы ОДНА из переменных будут иметь значение true

         */

        boolean resultConditionalOR = isTrue || isFalse;

        System.out.println(resultConditionalOR);


        /**

         Conditional NOT (!) - "логическое отрицание"

         результат = !логическая переменная № 1

         результат будет иметь значение противоположное значению в переменной к которой он применяется

         */

        boolean resultConditionalNOT = !isTrue;

        System.out.println(resultConditionalNOT);


        System.out.println("========== ПРИМЕРЫ ИСПОЛЬЗОВАНИЯ ============");

        // ПРИМЕРЫ


        int x = 10;

        System.out.println((x > 5) && (x < 15));

        System.out.println((x < 5) && (x < 15));

        System.out.println((x < 5) || (x < 15));

        System.out.println( !(x < 5) );





    }

}
