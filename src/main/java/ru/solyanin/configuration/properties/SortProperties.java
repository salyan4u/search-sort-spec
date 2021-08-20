package ru.solyanin.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "pagination.sort")
public class SortProperties {
    private String pattern = "([\\w\\.]+?)(:)(\\w+?);";
    private String fieldSeparator = ";";
}