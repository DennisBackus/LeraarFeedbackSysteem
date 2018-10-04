package com.leeraar.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leeraar.models.Persoon;
import com.leeraar.models.Klas;

public interface IPersonRepository extends CrudRepository<Persoon	, Long>{
	
	
	 List<Persoon> findAll();
	 
	 List<Persoon> findByName(String name);
	 
	 List<Persoon> findByKlas(Klas klas);
	 
	

}
