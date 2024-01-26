public class PrintFormat {
    public static void main(String[] args) {

        double pi = 3.1415;

        System.out.println(pi);

        System.out.printf("%.1f", pi);
        System.out.println();

        String piLikaString = String.format("%.2f", pi);

        System.out.println(piLikaString);

    }
}
