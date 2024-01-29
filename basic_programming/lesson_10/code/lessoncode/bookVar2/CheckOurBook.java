package lesson_10.code.lessoncode.bookVar2;

public class CheckOurBook {

    public boolean checkCatalogNumberForUndefined(Book bookForChecking){
        boolean checkingResult;

        String fieldCatalogNumber = bookForChecking.getCatalogNumber();
        if (fieldCatalogNumber.equals("undefined")) {
            checkingResult = true;
        } else {
            checkingResult = false;
        }

        return checkingResult;
    }

}
