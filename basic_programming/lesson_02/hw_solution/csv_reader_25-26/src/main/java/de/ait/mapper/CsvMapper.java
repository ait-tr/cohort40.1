package de.ait.mapper;

import de.ait.model.CsvRowModel;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 10.06.2023
 */
public class CsvMapper  {

    private CsvMapper() {
    }

    public static CsvRowModel toCsvRowModel(int rowNr, List<String> splitColumn) {
        return new CsvRowModel(
                rowNr,
                splitColumn.get(0),
                splitColumn.get(1),
                splitColumn.get(2),
                splitColumn.get(3),
                splitColumn.get(4),
                splitColumn.get(5),
                splitColumn.get(6),
                splitColumn.get(7),
                splitColumn.get(8),
                splitColumn.get(9),
                splitColumn.get(10),
                splitColumn.get(11),
                splitColumn.get(12),
                splitColumn.get(13),
                splitColumn.get(14),
                splitColumn.get(15),
                splitColumn.get(16),
                splitColumn.get(17),
                splitColumn.get(18)
        );
    }
}
