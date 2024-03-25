package de.ait.converter.strategy;


import de.ait.converter.Converter;
import de.ait.converter.RowConverter;
import de.ait.model.TransaktionCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public class TransaktionCodeConverterStrategy extends Converter implements RowConverter<TransaktionCode> {

    private static final String ERROR_MSG_NOT_FOUND = "Колонка '%s', значение '%s' код операции не найден. Доступные типы по ключам [%s]";


    @Override
    public TransaktionCode convert(String value,
                                   String columnName,
                                   List<String> errors,
                                   boolean isRequired) {

        RowConverter<Integer> intConverter = new IntConverterStrategy();
        Integer transaktionCodeKey = intConverter.convert(
                value,
                columnName,
                errors,
                isRequired
        );

        if (transaktionCodeKey == null) {
            return null;
        }

        TransaktionCode transaktionCode = null;

        for (TransaktionCode typ : TransaktionCode.values()) {
            if (typ.getKey() == transaktionCodeKey) {
                transaktionCode = typ;
            }
        }

        if (transaktionCode == null) {
            String availableIds = Arrays.stream(TransaktionCode.values())
//                    .map(x -> x.getKey())
//                    .map(x -> String.valueOf(x))
                    .map(TransaktionCode::getKey)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            String msg = String.format(ERROR_MSG_NOT_FOUND, columnName, value, availableIds);
            System.err.print(msg);
            errors.add(msg);
        }

        return transaktionCode;
    }
}
