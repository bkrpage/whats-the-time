package dev.bradleypage.config;

import dev.bradleypage.util.OutputTypeConverter;
import dev.bradleypage.util.UnitTypeConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyConfig extends WebMvcConfigurationSupport {
    @Override
    public FormattingConversionService mvcConversionService() {
        FormattingConversionService f = super.mvcConversionService();
        f.addConverter(new OutputTypeConverter());
        f.addConverter(new UnitTypeConverter());
        return f;
    }
}
