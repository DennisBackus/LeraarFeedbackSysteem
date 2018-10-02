package com.leraar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leraar.models.Klas;
import java.lang.String;

public interface IKlassDAO extends CrudRepository<Klas, Long>{
	
	List<Klas> findAll();
	
	List<Klas> findByName(String name);

}
