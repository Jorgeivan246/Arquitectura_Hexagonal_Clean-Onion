package com.project.citas.persistance.repository;

import com.project.citas.persistance.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonCrudRepository  extends JpaRepository<PersonEntity,Integer> {



}
