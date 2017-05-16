package service;

import formatter.LocalDateFormatter;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Created by Hao HOU on 2017/5/5.
 */
public class MyFormatterRegistrar implements FormatterRegistrar {
    private String datePattern;
    public MyFormatterRegistrar(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public void registerFormatters(FormatterRegistry registry) {
        registry.addFormatter(new LocalDateFormatter(datePattern));
    }
}
