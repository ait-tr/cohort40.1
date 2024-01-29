package lesson_10.code.lessoncode.stringCompare;

public class StringExample {
    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1);


        System.out.println("сравнение через '=='");
        boolean compareStr1AndStr2 = (str1 == str2);

        boolean compareStr1AndStr3 = (str1 == str3);

        System.out.println(compareStr1AndStr2);

        System.out.println(compareStr1AndStr3);

        System.out.println("сравнение через equals");

        compareStr1AndStr2 = (str1.equals(str2));

        compareStr1AndStr3 = (str1.equals(str3));

        System.out.println(compareStr1AndStr2);

        System.out.println(compareStr1AndStr3);


    }
}
