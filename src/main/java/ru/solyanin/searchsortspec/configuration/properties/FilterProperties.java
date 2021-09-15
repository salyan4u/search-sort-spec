package ru.solyanin.searchsortspec.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "pagination.filter")
public class FilterProperties {
    private String arraySeparator = "|";
    private String fieldSeparator = ";";
    private String levelSeparator = "_";
    private String pattern = "([\\.\\w]+?)(::|!:|<<|>>|>:|<:)([\\w\\s\\.\\(\\)\\-А-яЁё<>|%]+?);";
}