package de.ait.converter.strategy;


import de.ait.converter.Converter;
import de.ait.converter.RowConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public class LocalDateConverterStrategy extends Converter implements RowConverter<LocalDate> {
    private static final String ERROR_MSG = "Колонка '%s', значение '%s' не соответствует формату (yyyy-MM-dd)";

    @Override
    public LocalDate convert(String value,
                             String columnName,
                             List<String> errors,
                             boolean isRequired) {
        if (checkIsRequired(value, columnName, errors, isRequired)) {
            return null;
        }

        if (value == null) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            return LocalDate.parse(value, formatter);
        } catch (DateTimeParseException e) {
            System.err.print(e.getMessage());
            errors.add(String.format(ERROR_MSG, columnName, value));
            return null;
        }
    }
}
