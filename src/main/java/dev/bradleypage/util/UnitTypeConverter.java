package dev.bradleypage.util;

import dev.bradleypage.model.UnitType;
import org.springframework.core.convert.converter.Converter;

public class UnitTypeConverter implements Converter<String, UnitType> {
    @Override
    public UnitType convert(String source) {
        return UnitType.get(source);
    }
}
