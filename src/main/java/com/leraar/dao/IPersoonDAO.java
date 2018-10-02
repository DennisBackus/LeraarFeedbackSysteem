package com.leraar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.leraar.models.Persoon;
import java.lang.String;

public interface IPersoonDAO extends CrudRepository<Persoon	, Long>{
	
	
	 List<Persoon> findAll();
	 
	 List<Persoon> findByName(String name);
	 
	 
	 
	

}
