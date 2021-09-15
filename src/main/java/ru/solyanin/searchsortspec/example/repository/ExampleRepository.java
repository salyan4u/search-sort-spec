package ru.solyanin.searchsortspec.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.solyanin.searchsortspec.example.model.Example;

import java.util.UUID;

@Repository
public interface ExampleRepository extends JpaRepository<Example, UUID>, JpaSpecificationExecutor<Example> {
}
