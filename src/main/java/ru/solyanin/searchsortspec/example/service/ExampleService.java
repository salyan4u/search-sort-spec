package ru.solyanin.searchsortspec.example.service;

import ru.solyanin.searchsortspec.example.model.Example;

import javax.transaction.Transactional;
import java.util.UUID;

public interface ExampleService {
    Example getByUUID(UUID uuid);

    @Transactional
    void delete(UUID uuid);
}
