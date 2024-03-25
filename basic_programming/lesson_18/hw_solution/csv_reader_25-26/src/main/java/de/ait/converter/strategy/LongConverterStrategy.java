package de.ait.converter.strategy;

import de.ait.converter.Converter;
import de.ait.converter.RowConverter;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 08.07.2023
 */
public class LongConverterStrategy extends Converter implements RowConverter<Long> {

    private static final String ERROR_MSG = "Колонка '%s', значение '%s' не является числом";

    @Override
    public Long convert(
            String value,
            String columnName,
            List<String> errors,
            boolean isRequired) {

        if (checkIsRequired(value, columnName, errors, isRequired)) {
            return null;
        }

        if (value == null) {
            return null;
        }

        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            System.err.print(e.getMessage());
            errors.add(String.format(ERROR_MSG, columnName, value));
            return null;
        }
    }
}
