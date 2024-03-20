package consultation.cons_18.consultationCode.validation;

public class EmailValidator2 {

    public static String validate(String email)  {

        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty()) return "Ошибка № 1";

        // tttt@trtrtr.n.et
        // 1. @ |
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return "Ошибка № 2";

        // 2. Должна быть точка после @

        // Method overload - starts after with the index (in this case, the sign index @
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return "Ошибка № 3";

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return "Ошибка № 4";

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) return "Ошибка № 5";


        // 5. Only alphabet characters, numbers, '-', '_', '.', '@' can only be present.

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            //true, if the symbol satisfies at least one of the criteria.
            boolean isCharValid = (
                    Character.isAlphabetic(c)
                            || Character.isDigit(c)
                            || c == '-'
                            || c == '_'
                            || c == '.'
                            || c == '@'
            );

            if (!isCharValid) return "Ошибка № 6";

        }

        return "Ошибки нет";
        // All checks passed, nowhere did the method return false ->

    }
}
