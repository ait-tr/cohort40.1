package consultation.cons_04.consultationCode.code;

public class DoubleLoop {

    public static void main(String[] args) {
// начинаем цикл с индексом i
        for (int i = 0; i < 10; i++) {

            System.out.println("Индекс i = " + i);

            // начинаем цикл с индексом j
            for (int j = 0; j < 10; j++) {
                System.out.println("      Индекс j = " + j);
            }
            System.out.println("Выполнение цикла с индексом j закончился");
        }

        System.out.println("Выполнение цикла с индексом i закончился");

    }
}
