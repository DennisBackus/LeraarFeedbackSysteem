package com.leeraar.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leeraar.models.Klas;
import com.leeraar.models.Leerling;

public interface IleerlingRepository extends CrudRepository<Leerling, Long>{
	
	
	 List<Leerling> findAll();
	 
	 List<Leerling> findByKlas(Klas klas);

}
