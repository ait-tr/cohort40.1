package de.ait.mapper;

import de.ait.converter.RowConverter;
import de.ait.model.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author Andrej Reutow
 * created on 24.06.2023
 */
public class TransactionMapper {

    private final Map<RowConverterEnum, RowConverter> rowConverters;

    public TransactionMapper(Map<RowConverterEnum, RowConverter> rowConverters) {
        this.rowConverters = rowConverters;
    }

    @SuppressWarnings("unchecked")
    public Transaction mapToTransaction(CsvRowModel model) {
        List<String> errors = model.getErrors();

        RowConverter<TransaktionTyp> transaktionTypConverter = rowConverters.get(RowConverterEnum.TRANSAKTION_TYPE);
        RowConverter<OperationTyp> operationTypConverter = rowConverters.get(RowConverterEnum.OPERATION_TYPE);
        RowConverter<TransaktionCode> transaktionCodeConverter = rowConverters.get(RowConverterEnum.TRANSAKTION_CODE);
        RowConverter<Long> longConverter = rowConverters.get(RowConverterEnum.LONG);
        RowConverter<Integer> integerConverter = rowConverters.get(RowConverterEnum.INTEGER);
        RowConverter<Double> doubleConverter = rowConverters.get(RowConverterEnum.DOUBLE);
        RowConverter<LocalDateTime> localDataTimeConverter = rowConverters.get(RowConverterEnum.LOCAL_DATE_TIME);
        RowConverter<String> stringConverter = rowConverters.get(RowConverterEnum.STRING);

        return new Transaction(
                transaktionTypConverter.convert(
                        model.getTransaktionTypKey(),
                        "TRANSAKTION_TYP_KEY",
                        errors,
                        true
                ),
                operationTypConverter.convert(
                        model.getOperationTypKey(),
                        "OPERATION_TYP_KEY",
                        errors,
                        true
                ),
                transaktionCodeConverter.convert(
                        model.getTransactionsCode(),
                        "TRANSACTIONS_CODE",
                        errors,
                        true
                ),
                longConverter.convert(
                        model.getTransaktionNr(),
                        "TRANSAKTION_NUMMER",
                        errors,
                        true
                ),
                integerConverter.convert(
                        model.getAdditionalTransaktionNr(),
                        "ADDITIONAL_TRANSAKTION_NUMBER",
                        errors,
                        true
                ),
                doubleConverter.convert(
                        model.getBetrag(),
                        "BETRAG",
                        errors,
                        true
                ),
                integerConverter.convert(
                        model.getCurrency(),
                        "CURRENCY",
                        errors,
                        true
                ),
                localDataTimeConverter.convert(
                        model.getTransDatum(),
                        "TRANS_DATUM",
                        errors,
                        true
                ),
                localDataTimeConverter.convert(
                        model.getValuta(),
                        "VALUTA",
                        errors,
                        true
                ),
                stringConverter.convert(
                        model.getBemerkung1(),
                        "BEMERKUNG1",
                        errors,
                        false
                ),
                stringConverter.convert(
                        model.getBemerkung2(),
                        "BEMERKUNG2",
                        errors,
                        false
                )
        );
    }
}
