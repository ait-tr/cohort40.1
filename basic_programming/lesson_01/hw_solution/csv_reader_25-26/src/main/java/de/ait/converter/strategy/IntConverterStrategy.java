package de.ait.converter.strategy;


import de.ait.converter.Converter;
import de.ait.converter.RowConverter;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public class IntConverterStrategy extends Converter implements RowConverter<Integer> {

    private static final String ERROR_MSG_SIZE = "Колонка '%s', значение '%s' должно быть между " + Integer.MIN_VALUE + " и " + Integer.MAX_VALUE;

    @Override
    public Integer convert(String value,
                           String columnName,
                           List<String> errors,
                           boolean isRequired) {
        RowConverter<Long> longConverter = new LongConverterStrategy();
        Long convertedLong = longConverter.convert(
                value,
                columnName,
                errors,
                isRequired
        );

        if (!(Integer.MAX_VALUE >= convertedLong && Integer.MIN_VALUE <= convertedLong)) {
            errors.add(String.format(ERROR_MSG_SIZE, columnName, value));
            return null;
        }

        return convertedLong.intValue();
    }
}
