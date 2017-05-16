package converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Created by Hao HOU on 2017/5/5.
 */
public class StringToLocalDateConverter implements Converter<String, LocalDate> {
    private String datePattern;

    public StringToLocalDateConverter(String datePattern){
        this.datePattern = datePattern;
    }

    @Override
    public LocalDate convert(String s){
        try {
            return LocalDate.parse(s, DateTimeFormatter.ofPattern(datePattern));
        } catch (DateTimeParseException e){
            throw new IllegalArgumentException(
                    "Invalid date format. Please use this pattern\"" + datePattern + "\""
            );
        }
    }
}
