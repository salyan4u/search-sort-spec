package ru.solyanin.searchsortspec.example.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import ru.solyanin.searchsortspec.configuration.properties.FilterProperties;
import ru.solyanin.searchsortspec.configuration.properties.SortProperties;
import ru.solyanin.searchsortspec.example.model.Example;
import ru.solyanin.searchsortspec.example.repository.ExampleRepository;
import ru.solyanin.searchsortspec.example.service.ExampleService;
import ru.solyanin.searchsortspec.service.impl.AbstractPageableService;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;
import java.util.UUID;

@Service
public class ExampleServiceImpl extends AbstractPageableService<Example, ExampleRepository> implements ExampleService {
    protected ExampleServiceImpl(ExampleRepository jpaSpecificationExecutor, FilterProperties filterProperties, SortProperties sortProperties) {
        super(jpaSpecificationExecutor, filterProperties, sortProperties);
    }

    @Override
    public Page<Example> getPage(int number, int size, String search, String sort) {
        return super.getPage(number, size, search, sort);
    }

    @Override
    public Example getByUUID(UUID uuid) throws EntityNotFoundException {
        Optional<Example> example = jpaSpecificationExecutor.findById(uuid);
        if (example.isPresent()) {
            return example.get();
        } else throw new EntityNotFoundException();
    }

    @Override
    public void delete(UUID uuid) {
        //logic to delete entity
    }
}
