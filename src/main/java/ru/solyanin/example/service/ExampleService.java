package ru.solyanin.example.service;

import ru.solyanin.example.model.Example;

import javax.transaction.Transactional;
import java.util.UUID;

public interface ExampleService {
    Example getByUUID(UUID uuid);

    @Transactional
    void delete(UUID uuid);
}
