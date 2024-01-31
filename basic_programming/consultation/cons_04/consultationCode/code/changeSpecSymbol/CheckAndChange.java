package consultation.cons_04.consultationCode.code.changeSpecSymbol;

public class CheckAndChange {

    public String change(String text){
        String changedText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isNotSpecial = checkSymbol(currentChar);
            if (isNotSpecial) {
                changedText = changedText + currentChar;
            }
        }

        return changedText;
    }

    private boolean checkSymbol(char currentChar){

        boolean checkResult = true;

        if (currentChar == '(') { checkResult = false;}
        if (currentChar == ')') { checkResult = false;}
        if (currentChar == '@') { checkResult = false;}
        if (currentChar == '!') { checkResult = false;}
        if (currentChar == '&') { checkResult = false;}
        if (currentChar == '%') { checkResult = false;}

        return checkResult;
    }
}
