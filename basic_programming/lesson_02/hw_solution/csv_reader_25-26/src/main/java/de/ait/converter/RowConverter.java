package de.ait.converter;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 08.07.2023
 */
public interface RowConverter<T> {

    T convert(String value,
              String columnName,
              List<String> errors,
              boolean isRequired);
}
