package pl.damian.bookexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.damian.bookexample.config.PictureUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({PictureUploadProperties.class})
public class BookExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookExampleApplication.class, args);
    }
}
