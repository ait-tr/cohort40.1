package de.ait.converter.strategy;

import de.ait.converter.Converter;
import de.ait.converter.RowConverter;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public class StringConverterStrategy extends Converter implements RowConverter<String> {

    @Override
    public String convert(String value,
                          String columnName,
                          List<String> errors,
                          boolean isRequired) {

        if (checkIsRequired(value, columnName, errors, isRequired)) {
            return null;
        }

        return value;
    }
}
