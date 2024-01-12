package com.project.citas.domain.repository;

import com.project.citas.domain.pojo.PersonPojo;

import java.util.List;
import java.util.Optional;

public interface IPersonRepository {

    List<PersonPojo> getAll();


    Optional<PersonPojo> getPerson(Integer id);


    PersonPojo save(PersonPojo personPojo);


    void delete(Integer PersonPojo);
}
