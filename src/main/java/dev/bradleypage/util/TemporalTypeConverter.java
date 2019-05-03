package dev.bradleypage.util;

import dev.bradleypage.model.TemporalType;
import org.springframework.core.convert.converter.Converter;

public class TemporalTypeConverter implements Converter<String, TemporalType> {
    @Override
    public TemporalType convert(String source) {
        return TemporalType.get(source);
    }
}
