package pl.damian.bookexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.damian.bookexample.USLocalDateFormatter.USLocalDateFormatter;

import java.time.LocalDate;


@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(LocalDate.class, new USLocalDateFormatter());
    }
}
