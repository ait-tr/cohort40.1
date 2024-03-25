package de.ait.converter.strategy;


import de.ait.converter.Converter;
import de.ait.converter.RowConverter;
import de.ait.model.TransaktionTyp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 17.06.2023
 */
public class TransaktionTypConverterStrategy extends Converter implements RowConverter<TransaktionTyp> {

    private static final String ERROR_MSG_NOT_FOUND = "Колонка '%s', значение '%s' тип транзакции не найден. Доступные типы по ключам [%s]";

    @Override
    public TransaktionTyp convert(String value,
                                  String columnName,
                                  List<String> errors,
                                  boolean isRequired) {

        RowConverter<Integer> intConverter = new IntConverterStrategy();
        Integer transaktionTypeKey = intConverter.convert(
                value,
                columnName,
                errors,
                isRequired
        );

        if (transaktionTypeKey == null) {
            return null;
        }

        TransaktionTyp transaktionTyp = null;

        for (TransaktionTyp typ : TransaktionTyp.values()) {
            if (typ.getKey() == transaktionTypeKey) {
                transaktionTyp = typ;
            }
        }

        if (transaktionTyp == null) {
            String availableIds = Arrays.stream(TransaktionTyp.values())
//                    .map(x -> x.getKey())
//                    .map(x -> String.valueOf(x))
                    .map(TransaktionTyp::getKey)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            String msg = String.format(ERROR_MSG_NOT_FOUND, columnName, value, availableIds);
            System.err.print(msg);
            errors.add(msg);
        }

        return transaktionTyp;
    }
}
