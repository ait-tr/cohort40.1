package de.ait.converter;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public abstract class Converter {

    private static final String ERROR_MSG_REQUIRED = "Колонка '%s', значение является обязательным и не должно быть пустым";

    public boolean checkIsRequired(String value,
                                   String columnName,
                                   List<String> errors,
                                   boolean isRequired) {

        if (isRequired && (value == null || value.isBlank())) {
            System.err.print(ERROR_MSG_REQUIRED);
            errors.add(String.format(ERROR_MSG_REQUIRED, columnName));
            return true;
        }
        return false;
    }
}
