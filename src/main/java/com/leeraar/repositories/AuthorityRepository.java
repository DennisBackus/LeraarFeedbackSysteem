package com.leeraar.repositories;

import com.leeraar.models.security.Authority;
import org.springframework.data.repository.CrudRepository;

/**
 * The Interface that executes queries on the database.
 */
public interface AuthorityRepository extends CrudRepository<Authority, Long> {

}