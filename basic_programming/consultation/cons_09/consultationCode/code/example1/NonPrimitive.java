package consultation.cons_09.consultationCode.code.example1;

public class NonPrimitive {
    public static void main(String[] args) {
//        Integer x;
//        Double y;
//        Boolean logic;
//        Character character;
//        Float fl;
//        Byte byt;


        String xText = "12";

        Integer xTextLikeDigit = Integer.parseInt(xText);

        System.out.println(xTextLikeDigit * xTextLikeDigit);

        xTextLikeDigit = 250;

        int x = xTextLikeDigit / 2;

        System.out.println(x);
    }
}
