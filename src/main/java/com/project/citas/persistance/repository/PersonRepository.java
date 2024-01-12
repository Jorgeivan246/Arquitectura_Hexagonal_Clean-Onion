package com.project.citas.persistance.repository;

import com.project.citas.domain.pojo.PersonPojo;
import com.project.citas.domain.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class PersonRepository implements IPersonRepository {
    @Override
    public List<PersonPojo> getAll() {
        return null;
    }

    @Override
    public Optional<PersonPojo> getPerson(Integer id) {
        return Optional.empty();
    }

    @Override
    public PersonPojo save(PersonPojo personPojo) {
        return null;
    }

    @Override
    public void delete(Integer PersonPojo) {

    }
}
