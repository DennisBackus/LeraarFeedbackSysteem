package com.leraar.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leraar.models.Klas;
import com.leraar.models.Leerling;

public interface ILeerlingDAO extends CrudRepository<Leerling, Long>{
	
	
	 List<Leerling> findAll();
	 
	 List<Leerling> findByKlas(Klas klas);
	 
	 

}
