package com.leraar.dao;

import org.springframework.data.repository.CrudRepository;

import com.leraar.models.Leraar;

public interface ILeraarDAO extends CrudRepository<Leraar, Long> {

}
