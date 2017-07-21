package com.app.demo.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.demo.model.Name;

/**
 * User: wahnonm
 * Date: 10/09/14
 * Time: 20:33
 */
@RepositoryRestResource(collectionResourceRel = "name", path = "name")
public interface NameRepository extends CrudRepository<Name, Long> {

}
