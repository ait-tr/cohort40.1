package lesson_07.code.lessoncode;

public class FindAndReplaceText {
    public static void main(String[] args) {

        String symbols = "012345-01-6789-101";

        // поиск индекса первого вхождения подстроки в строку

        int index = symbols.indexOf("6789");
        System.out.println("index: " + index);

        int indexSecond = symbols.indexOf('-');

        System.out.println("второй индекс: " + indexSecond);

        // Замена символов строки на другие

        String replacedAllLine = symbols.replace("-","*");

        System.out.println(replacedAllLine);

        String replaceFirstLine = symbols.replaceFirst("-",":");
        System.out.println(replaceFirstLine);


        // Поиск последнего вхождения

        int indexSecondLast = symbols.lastIndexOf('-');

        System.out.println("последний индекс вхождения подстроки: " + indexSecondLast);

        //


        String stringForReplace = "Строка для замены по индексам которые используются для замены ";

//        Вариант превый, но не очень удачный, потому что если в нашем тексте будет встречаться еще раз этот же фрагмент
//        который мы хотим заменить то он тоже будет заменен
//        int indexStart = 7;
//        int indexEnd = 17;
//
//        String partForReplace = stringForReplace.substring(indexStart,indexEnd);
//
//        String stringAfterReplace = stringForReplace.replace(partForReplace,"after replace");
//
//        System.out.println(stringAfterReplace);

        int indexStart = 7;
        int indexEnd = 17;

        String firstPartOurText = stringForReplace.substring(0,indexStart);
        String lastPartOurText = stringForReplace.substring(indexEnd);

        String textForReplace = "after replace";

        String finalStringAfterReplace = firstPartOurText + textForReplace + lastPartOurText;

        System.out.println(stringForReplace);
        System.out.println(finalStringAfterReplace);

    }
}
