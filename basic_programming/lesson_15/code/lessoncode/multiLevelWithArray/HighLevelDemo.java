package lesson_15.code.lessoncode.multiLevelWithArray;

import java.util.Arrays;

public class HighLevelDemo {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "Whiskey";
        names[1] = "Single";
        DataLowLevel dataLowLevel = new DataLowLevel(names);
        DataMiddleLevel dataMiddleLevel = new DataMiddleLevel("White Horse", dataLowLevel);
        DataHighLevel dataHighLevel = new DataHighLevel(1, dataMiddleLevel);

        System.out.println("Данные на уровне dataHighLevel");
        System.out.println(dataHighLevel.idHiLevel);

        System.out.println("Данные на из поля dataMiddleLevel в dataHighLevel");
        System.out.println(dataHighLevel.dataMiddleLevel.label);

        System.out.println("Данные на из поля dataLowLevel в dataMiddleLevel в dataHighLevel");
        System.out.println(Arrays.toString(dataHighLevel.dataMiddleLevel.dataLowLevel.name));

        // для замены значения в каком-нибудь поле
        // вариант 1

        dataHighLevel.dataMiddleLevel.dataLowLevel.name[1] = "Scotch";

        System.out.println();
        System.out.println(Arrays.toString(dataHighLevel.dataMiddleLevel.dataLowLevel.name));

        // вариант 2

        String[] myLocalStringArray = dataHighLevel.dataMiddleLevel.dataLowLevel.name;

        System.out.println(Arrays.toString(myLocalStringArray));


    }

}
