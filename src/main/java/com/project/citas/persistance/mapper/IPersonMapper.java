package com.project.citas.persistance.mapper;


import com.project.citas.domain.pojo.PersonPojo;
import com.project.citas.persistance.entity.PersonEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


/*
Mapper que transforma objetos de person a pojo o entidades
 */
@Mapper(componentModel = "string")
public interface IPersonMapper {

    /**
     * Convierte una entidad Person a un pojo de person
     * @param personEntity Entidad a convertir
     * @return Pojo convertido
     */


    @Mapping(source = "id", target = "id")
    @Mapping(source = "emailAdress", target = "emailAdress")
    PersonPojo toPersonPojo(PersonEntity personEntity);

    /**
     * Convierte un pojo Person a una entidad Person
     * @param personPojo Pojo a convertir
     * @return Entidad convertida
     */
    @InheritInverseConfiguration
    PersonEntity toPersonEntity(PersonPojo personPojo);


    /**
     * Retorna una lista de PersonPojo tranformada a pojo de una lista de entidades
     * @param PersonEntity Entidad a transformar
     * @return Lista de pojos tranformados
     */
    List<PersonPojo> toPersonPojo(List<PersonEntity> PersonEntity) ;


}
