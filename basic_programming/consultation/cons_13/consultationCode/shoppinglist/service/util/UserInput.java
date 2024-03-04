package consultation.cons_13.consultationCode.shoppinglist.service.util;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String getText(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static Integer getInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public static Double getDouble(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }

}
