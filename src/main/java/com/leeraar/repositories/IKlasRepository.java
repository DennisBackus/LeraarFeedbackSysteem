package com.leeraar.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leeraar.models.Klas;

public interface IKlasRepository extends CrudRepository<Klas, Long>{
	
	List<Klas> findAll();
	
	List<Klas> findByName(String name);

}
