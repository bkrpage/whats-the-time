package dev.bradleypage.util;

import dev.bradleypage.model.OutputType;
import org.springframework.core.convert.converter.Converter;

public class OutputTypeConverter implements Converter<String, OutputType> {
    @Override
    public OutputType convert(String source) {
        return OutputType.get(source);
    }
}
