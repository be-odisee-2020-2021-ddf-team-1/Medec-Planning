package com.example.demo.dao;

import com.example.demo.domain.Planning;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface PlanningRepository extends CrudRepository<Planning,Long> {

    // hier moet men geen methods implementeren voor standaard CRUD sinds zij automatisch gegeneerd zullen worden door Spring Data JPA
    // https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html


}
