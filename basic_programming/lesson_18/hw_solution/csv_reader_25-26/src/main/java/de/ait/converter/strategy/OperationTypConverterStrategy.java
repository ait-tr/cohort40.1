package de.ait.converter.strategy;


import de.ait.converter.Converter;
import de.ait.converter.RowConverter;
import de.ait.model.OperationTyp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public class OperationTypConverterStrategy extends Converter implements RowConverter<OperationTyp> {

    private static final String ERROR_MSG_NOT_FOUND = "Колонка '%s', значение '%s' тип операции не найден. Доступные типы по ключам [%s]";

    @Override
    public OperationTyp convert(String value,
                                String columnName,
                                List<String> errors,
                                boolean isRequired) {

        RowConverter<Integer> intConverter = new IntConverterStrategy();
        Integer operationTypKey = intConverter.convert(
                value,
                columnName,
                errors,
                isRequired
        );

        if (operationTypKey == null) {
            return null;
        }

        OperationTyp operationTyp = null;

        for (OperationTyp typ : OperationTyp.values()) {
            if (typ.getKey() == operationTypKey) {
                operationTyp = typ;
            }
        }

        if (operationTyp == null) {
            String availableIds = Arrays.stream(OperationTyp.values())
//                    .map(x -> x.getKey())
//                    .map(x -> String.valueOf(x))
                    .map(OperationTyp::getKey)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", ")); // 1, 2, 3
            String msg = String.format(ERROR_MSG_NOT_FOUND, columnName, value, availableIds);
            System.err.print(msg);
            errors.add(msg);
        }

        return operationTyp;
    }
}
