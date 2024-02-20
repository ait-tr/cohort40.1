package lesson_26.code.lessoncode.dynamicArrayStructure;

import java.util.Arrays;

public class DasExample {
    public static void main(String[] args) {
        DAS das = new DAS();
        String[] strings = new String[10];

        das.addNewElement(strings, "Text1");
        das.addNewElement(strings, "Text2");
        das.addNewElement(strings, "Text3");
        das.addNewElement(strings, "Text4");
        das.addNewElement(strings, "Text5");
        das.addNewElement(strings, "Text6");
        das.addNewElement(strings, "Text7");
        das.addNewElement(strings, "Text8");
        das.addNewElement(strings, "Text9");
        das.addNewElement(strings, "Text10");
        System.out.println(Arrays.toString(strings));


        strings = das.addNewElement(strings, "Text11");

        System.out.println(Arrays.toString(strings));

    }
}
