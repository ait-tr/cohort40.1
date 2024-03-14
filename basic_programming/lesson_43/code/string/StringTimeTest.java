package lesson_43.code.string;

public class StringTimeTest {
    public static void main(String[] args) {
        String str = "";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Operations time is: " + (endTime - startTime));



        StringBuilder sb = new StringBuilder();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("Operations time is: " + (endTime - startTime));


    }
}
